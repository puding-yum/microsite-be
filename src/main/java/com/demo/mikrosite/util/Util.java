package com.demo.mikrosite.util;
import com.google.gson.Gson;

public class Util {
    public static String toJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
