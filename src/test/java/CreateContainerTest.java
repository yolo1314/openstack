import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.openstack.OSFactory;

public class CreateContainerTest {
    public static void main(String[] args) {
        OSClient.OSClientV3 client = OSFactory.builderV3()
                .endpoint("http://192.168.10.10:5000/v3")
                .credentials("admin", "123456", Identifier.byName("Default"))
                .scopeToProject(Identifier.byName("admin"), Identifier.byName("Default"))
                .authenticate();

        ActionResponse response = client.objectStorage().containers().create("javaContainer");
        System.out.println(response);
    }
}
