package com.dingchi.openstack555.controller.catalog;

import com.dingchi.openstack555.util.MyResponse;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.model.identity.v3.Service;
import org.openstack4j.model.identity.v3.User;
import org.openstack4j.openstack.OSFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
    @RequestMapping("/list")
    public String listPage(){
        return "/catalog/list";
    }

    @RequestMapping("/list.json")
    @ResponseBody
    public MyResponse<? extends Service> list(){
        OSClient.OSClientV3 os= OSFactory
                .builderV3()
                .endpoint("http://192.168.10.10:5000/v3")
                .credentials("admin","123456", Identifier.byName("Default"))
                .scopeToProject(Identifier.byName("admin"),Identifier.byName("Default")).authenticate();
        return new MyResponse<>(os.getToken().getCatalog());
    }
    @RequestMapping("/cre")
    public String cre(Model model){
        OSClient.OSClientV3 os= OSFactory
                .builderV3()
                .endpoint("http://192.168.10.10:5000/v3")
                .credentials("admin","123456", Identifier.byName("Default"))
                .scopeToProject(Identifier.byName("admin"),Identifier.byName("Default")).authenticate();
        User user= os.getToken().getUser();
          model.addAttribute("user",user);
          model.addAttribute("project",os.getToken().getProject());
          model.addAttribute("authUrl",os.getToken().getEndpoint());

        return "/catalog/cre";
    }
}
