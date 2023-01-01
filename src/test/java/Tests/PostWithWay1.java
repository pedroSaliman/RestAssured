package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.*;

public class PostWithWay1 {

    @Test
    public void post1(){
        Response resp= ApiUtilities.postdetails().
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                 .post("api/users");
        resp.prettyPrint();
        Assert.assertEquals(201,resp.statusCode());
        Assert.assertEquals("leader",resp.jsonPath().get("job"));
    }

}
