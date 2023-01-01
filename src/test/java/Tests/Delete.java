package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;

public class Delete {

    @Test
    public void del(){
        Response resp= ApiUtilities.getRequest().delete("api/users/2");
        Assert.assertEquals(204,resp.statusCode());
    }
}
