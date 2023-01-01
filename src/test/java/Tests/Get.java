package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;
import utilities.Constant;

public class Get {


    @Test
    public void get(){
        Response resp= ApiUtilities.getRequest().get("api/users?page=2");
        resp.prettyPrint();
        Assert.assertEquals("Michael",resp.jsonPath().get("data[0].first_name"));

    }
}
