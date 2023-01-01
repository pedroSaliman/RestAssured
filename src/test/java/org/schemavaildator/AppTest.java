package org.schemavaildator;


import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.Test;
import org.pojo.Application;
import utilities.ApiUtilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static utilities.RandomUtil.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
@Test
    public void test1() throws IOException {
Application appl=Application.builder().setJob(name()).setName(job()).perform();
    Response resp=
                      ApiUtilities.postdetails().body(appl).post("api/users");




    System.out.println(resp.jsonPath().get("job"));

    resp.then().
            body(JsonSchemaValidator.matchesJsonSchema(
                    new File(System.getProperty("user.dir") + "/src/test/java/resources/schema.json")));

    Files.write(Paths.get(System.getProperty("user.dir") + "/src/test/java/resources/resp.json"),resp.asByteArray());

}
}
