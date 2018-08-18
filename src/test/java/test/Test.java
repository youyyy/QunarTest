package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.example.demo.util.JsonUtil;

import java.io.IOException;



/**
 * Created by yi.you on 2018/8/15.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String jsVersion = "1534307476232";
        JSONObject encode = JSON.parseObject("{" +
                "\"fnCall\":[\"leftShift\",\"swap\"]," +
                "\"base32Map\":\"zgLNlcvGF9ZXmJyq7oVRp0tuEP/M3CO2=\"," +
                "\"leftShiftNum\":1" +
                "}");
        JSONObject decode = JSON.parseObject("{" +
                "\"fnCall\":[\"swap\",\"rightShift\"]," +
                "\"rightShiftNum\":1," +
                "\"base32Map\":\"zgLNlcvGF9ZXmJyq7oVRp0tuEP/M3CO2=\"" +
                "}");
        String testStr = "VLt9Mvm7VLFPoGJo0tEMNmJo00FpoXm70tF7====|1534307476232";
        JSONObject object = new JSONObject();
        object.put("jsVersion", jsVersion);
        object.put("encode", encode);
        object.put("decode",decode);
        object.put("testStr",testStr);
        System.out.println(JsonUtil.serialize(object));
    }
}
