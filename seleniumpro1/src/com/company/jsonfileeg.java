package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class jsonfileeg {
    public static void main(String[] args) throws IOException {

        JSONObject jonobj=new JSONObject();
        jonobj.put("name","sanjay");
        jonobj.put("age",1);

        JSONArray arrayobj=new JSONArray();
        arrayobj.add("hello all");
        arrayobj.add("happy world");
        jonobj.put("special char",arrayobj);

        FileWriter filewriter=new FileWriter("jsonsilehere.json");
        filewriter.write(jonobj.toJSONString());
        filewriter.close();
    }
}
