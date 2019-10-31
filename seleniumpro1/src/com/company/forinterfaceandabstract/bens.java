package com.company.forinterfaceandabstract;

public class bens extends abstractclassegg {
    public void engininfo(){
        System.out.println("hello in bens");
    }
    public void carwheel(){
        System.out.println("hello from bens child");
    }

    public static void main(String[] args){
        abstractclassegg car=new bens();
        car.carwheel();
        car.engininfo();
    }
}
