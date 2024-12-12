package com.dingchi.openstack555.controller;

import com.dingchi.openstack555.util.OSClientUtil;
import com.dingchi.openstack555.util.R;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.model.identity.v3.Service;
import org.openstack4j.model.identity.v3.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("keystone")
public class KeystoneController {
    @RequestMapping("catalog")
    public String catalog() {
        return "project/catalog/catalog";
    }

    @RequestMapping("catalog.json")
    @ResponseBody
    public R<List<? extends Service>> catalogJson() {
        List<? extends Service> catalog = OSClientUtil.getClient().getToken().getCatalog();
        return new R<>(catalog);
    }

    /**
     *
     * 用户凭证详情
     * @param model
     * @return
     */
    @RequestMapping("credential")
    public String credential(Model model) {
        OSClient.OSClientV3 client = OSClientUtil.getClient();
        //用户信息
        User user = client.getToken().getUser();
        //项目信息
        Project project = client.identity().projects().getByName("admin").get(0);
        //url
        String endpoint = client.getEndpoint();

        //url
        model.addAttribute("endpoint", endpoint);
        //用户信息
        model.addAttribute("user", user);
        //项目信息
        model.addAttribute("project", project);
        return "project/catalog/credential";
    }
}
