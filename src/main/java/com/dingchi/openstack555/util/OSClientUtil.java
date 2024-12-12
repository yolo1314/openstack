package com.dingchi.openstack555.util;

import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.openstack.OSFactory;

public class OSClientUtil {

    public static OSClient.OSClientV3 getClient() {
        return OSFactory.builderV3()
                .endpoint("http://192.168.10.10:5000/v3")
                .credentials("admin", "123456", Identifier.byName("Default"))
                .scopeToProject(Identifier.byName("admin"), Identifier.byName("Default"))
                .authenticate();
    }
}
