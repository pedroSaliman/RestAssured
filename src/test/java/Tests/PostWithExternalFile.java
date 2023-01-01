package Tests;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApiUtilities;
import utilities.Constant;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;

public class PostWithExternalFile {
    ////// Before
    @Test
    public void post1(){
        Response resp= given()
                .body(new File("E:/seleniumprojects/gitendtoend/masterRestassured/src/test/java/resources/body.json"))
                .log().all() .post("https://reqres.in/api/users");
        resp.prettyPrint();
    }
//////  After
    @Test
    public void Post2() throws IOException {
        String body= ApiUtilities.ReadFromExternalFile(Constant.PATHFile);
        String replace=body.replace("morpheus","mohamed");
        Response resp= ApiUtilities.postdetails().body(replace).post("api/users");
        resp.prettyPrint();
        Assert.assertEquals(201,resp.statusCode());


    }
}
