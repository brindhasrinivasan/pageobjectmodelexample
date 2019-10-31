package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



import java.io.FileReader;
import java.io.IOException;

import java.util.Iterator;

public class jsonreaderforfile {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parserobj=new JSONParser();
        FileReader filereadinfo=new FileReader("jsonsilehere.json");
        Object obj=parserobj.parse(filereadinfo);
        JSONObject jsonobj=(JSONObject) obj;

        String name= (String) jsonobj.get("Name");
        Long age=(Long) jsonobj.get("age");
        JSONArray special=(JSONArray) jsonobj.get("special char");

        Iterator iterator= special.iterator();
        System.out.println("name:"+name);
        System.out.println("age"+age);
        while (iterator.hasNext()){
            System.out.println("special :"+iterator.next());
        }
    }
}
