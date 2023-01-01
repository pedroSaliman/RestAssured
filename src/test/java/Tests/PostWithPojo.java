package Tests;
import io.restassured.response.Response;
import org.pojo.Application;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.*;

public class PostWithPojo {
    @Test
    public void PostPojo(){
        Application ap=Application.builder().setName("walled").setJob("Tester").perform();

        Response resp= ApiUtilities.postdetails().body(ap).post("api/users");
        resp.prettyPrint();
        Assert.assertEquals(201,resp.statusCode());
        Assert.assertEquals("Tester",resp.jsonPath().get("job"));
    }




}
