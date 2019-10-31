package com.company;

public class caseexecution {

    String flower="rose";


    public void tryingcaseseg(){
        switch (flower){
            case "lillie":
                System.out.println("she is lillie");
                break;
            case "rose":
                System.out.println("she is rose");
                break;
            case "lotus":
                System.out.println("she is lotus");
                break;
            default:
                System.out.println("she is not a flower");
                break;
        }
    }
    public static void main(String[] args){
        caseexecution checkthis=new caseexecution();
        checkthis.tryingcaseseg();
    }
}
