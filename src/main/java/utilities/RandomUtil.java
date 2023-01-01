package utilities;

public class RandomUtil {
    private RandomUtil(){}

    public static String job(){
        return FakerUtil.getString1().toUpperCase();
    }
    public static String name(){
        return FakerUtil.getString2().toUpperCase();
    }
}
