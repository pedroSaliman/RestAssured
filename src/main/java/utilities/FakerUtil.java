package utilities;

import com.github.javafaker.Faker;

public final class FakerUtil {
private FakerUtil(){}


    private static final Faker faker=new Faker();




public static String getString1(){
    return faker.name().firstName();
}


    public static String getString2(){
        return faker.name().lastName();
    }

}
