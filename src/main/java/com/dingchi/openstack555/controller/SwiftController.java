package com.dingchi.openstack555.controller;

import com.dingchi.openstack555.util.OSClientUtil;
import com.dingchi.openstack555.util.R;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.common.Payloads;
import org.openstack4j.model.storage.object.SwiftContainer;
import org.openstack4j.model.storage.object.SwiftObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RequestMapping("swift")
@Controller
public class SwiftController {
    /**
     * 容器页面
     *
     * @return
     */
    @RequestMapping("containers")
    public String containers() {
        return "project/swift/containers";
    }

    /**
     * 容器表格数据
     *
     * @return
     */
    @RequestMapping("containers.json")
    @ResponseBody
    public R<List<? extends SwiftContainer>> containersJson() {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //获取所有容器数据
        List<? extends SwiftContainer> list = client.objectStorage().containers().list();
        return new R<>(list);
    }

    /**
     * 容器内对象页面
     *
     * @param name
     * @param request
     * @return
     */
    @RequestMapping("objects")
    public String objects(String name, HttpServletRequest request) {
        //把容器名称放入session中 便于对象表格查询
        request.getSession().setAttribute("name", name);
        return "project/swift/objects";
    }

    /**
     * 容器内对象表格数据
     *
     * @param request
     * @return
     */
    @RequestMapping("objects.json")
    @ResponseBody
    public R<List<? extends SwiftObject>> objectsJson(HttpServletRequest request) {
        //取session中的容器名称
        String name = request.getSession().getAttribute("name").toString();
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //获取容器内所有对象数据
        List<? extends SwiftObject> objects = client.objectStorage().objects().list(name);
        return new R<>(objects);
    }

    /**
     * 添加容器页面
     * @return
     */
    @RequestMapping("addContainer")
    public String addContainer() {
        return "project/swift/addContainer";
    }

    /**
     * 添加容器
     * @param name
     * @return
     */
    @RequestMapping("addContainers")
    @ResponseBody
    public String addContainers(String name) {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //添加容器
        ActionResponse response = client.objectStorage().containers().create(name);
        if (response.isSuccess()) {
            return "success";
        }
        return "error";
    }

    /**
     * 添加对象
     * @param file
     * @param request
     * @return
     * @throws IOException
     */
    //    @RequestMapping(value = "addObject", method = RequestMethod.POST)
    @PostMapping("addObject")
    @ResponseBody
    public R<String> addObject(MultipartFile file, HttpServletRequest request) throws IOException {
        //取session中的容器名称
        String containerName = request.getSession().getAttribute("name").toString();
        //文件名
        String fileName = file.getOriginalFilename();
        //添加对象
        String put = OSClientUtil.getClient().objectStorage().objects().put(containerName, fileName, Payloads.create(file.getInputStream()));
        return new R<>(put);
    }

    /**
     * 删除容器
     * @param name
     * @return
     */
    @RequestMapping("delContainer")
    @ResponseBody
    public String delContainer(String name) {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //先删除容器里面的所有对象
        //获取容器内所有的对象
        List<? extends SwiftObject> objects = client.objectStorage().objects().list(name);
        //删除所有的对象
        objects.forEach(o -> client.objectStorage().objects().delete(name, o.getName()));
        //根据容器名称删除容器
        ActionResponse response = client.objectStorage().containers().delete(name);
        if (response.isSuccess()) {
            return "success";
        }
        return "error";
    }

    /**
     * 删除对象
     * @param name
     * @param request
     * @return
     */
    @RequestMapping("delObject")
    @ResponseBody
    public String delObject(String name,HttpServletRequest request) {
        //取session中的容器名称
        String containerName = request.getSession().getAttribute("name").toString();
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //根据容器名称以及对象名称删除对象
        ActionResponse response = client.objectStorage().objects().delete(containerName, name);
        if (response.isSuccess()) {
            return "success";
        }
        return "error";
    }
}
