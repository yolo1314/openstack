package com.dingchi.openstack555.controller;

import com.dingchi.openstack555.util.OSClientUtil;
import com.dingchi.openstack555.util.R;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.common.Payloads;
import org.openstack4j.model.image.v2.ContainerFormat;
import org.openstack4j.model.image.v2.DiskFormat;
import org.openstack4j.model.image.v2.Image;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("glance")
public class GlanceController {
    /**
     * 镜像页面
     * @return
     */
    @RequestMapping("imageList")
    public String imageList() {
        return "admin/glance/imageList";
    }

    /**
     * 镜像数据
     * @return
     */
    @RequestMapping("imageList.json")
    @ResponseBody
    public R<List<? extends Image>> imageListJson() {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //获取所有镜像
        List<? extends Image> list = client.imagesV2().list();
        return new R<>(list);
    }

    /**
     * 上传image
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("addImage")
    @ResponseBody
    public R<String> addImage(MultipartFile file) throws IOException {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //文件名
        String fileName = file.getOriginalFilename();
        //先创建image对象
        Image image = client.imagesV2().create(Builders.imageV2().name(fileName)
                .containerFormat(ContainerFormat.BARE)
                .diskFormat(DiskFormat.QCOW2)
                .visibility(Image.ImageVisibility.PUBLIC)
                .build());
        //再上传
        ActionResponse response = client.imagesV2().upload(image.getId(), Payloads.create(file.getInputStream()), image);
        if (response.isSuccess()) {
            return new R<>("success");
        }
        return new R<>("error");
    }

    /**
     * 删除镜像
     * @param id
     * @return
     */
    @RequestMapping("delImage")
    @ResponseBody
    public String delImage(String id) {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        ActionResponse response = client.imagesV2().delete(id);
        if (response.isSuccess()) {
            return "success";
        }
        return "error";
    }
}
