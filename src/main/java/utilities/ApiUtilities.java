package utilities;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import org.pojo.Application;

import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;
public final class ApiUtilities {
    private ApiUtilities(){}
   public static RequestSpecification getRequest(){

        return (RequestSpecification) given()
                .baseUri("https://reqres.in/").log().all();


   }


   public static RequestSpecification postdetails(){


       return (RequestSpecification) given()
               .baseUri(Constant.BASEURI).log().all().contentType(ContentType.JSON);


   }



   @SneakyThrows
   public static String ReadFromExternalFile(String filepath){
        return new String(Files.readAllBytes(Paths.get(filepath)));
   }


@SneakyThrows
public static String storejsonfile(String pathfile, Response response){
        return String.valueOf(Files.write(Paths.get(pathfile),response.asByteArray()));
}



}
