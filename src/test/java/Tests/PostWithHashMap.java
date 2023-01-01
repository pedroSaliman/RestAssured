package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;
import utilities.Body;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostWithHashMap {

    @Test
    public void postMap(){

        Response resp= ApiUtilities.postdetails().body(Body.map()).post("api/users");
        resp.prettyPrint();
        Assert.assertEquals(201,resp.statusCode());
        Assert.assertEquals("Tester",resp.jsonPath().get("job"));

    }
}
