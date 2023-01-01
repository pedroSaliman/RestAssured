package utilities;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Body {
    public static Map<String,String> map(){

        Map<String,String> body=new HashMap<>();
        body.put("name","mohamed");
        body.put("job","Tester");
        return body;
    }
    public static JSONObject json(){
        JSONObject object=new JSONObject();
        object.put("name","walled");
        object.put("job","Tester");
        object.accumulate("job","officer");
        return object;
    }
}
