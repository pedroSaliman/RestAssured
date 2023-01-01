package Tests;
import io.restassured.response.Response;

import org.assertj.core.api.Assertions;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;
import utilities.Body;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PostWithJson  {


    @Test
    public void PostJson(){
        //// in the body class
//        JSONObject object=new JSONObject();
//        object.put("name","walled");
//        object.put("job","Tester");
//        object.accumulate("job","officer");
        Response resp= ApiUtilities.postdetails().body(Body.json().toMap()).post("users/api");
        resp.prettyPrint();
    }
}
