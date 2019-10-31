package com.company.forinterfaceandabstract;

public class bmw extends abstractclassegg implements intrefacreeg{
    public void hello(){
        System.out.println("i m for the interface created");
    }

    @Override
    public void getdeto() {
        System.out.println("i m for interface");
    }

    @Override
    public void engininfo() {
        System.out.println("i m  from bmw");

    }
    public static void main(String[] args){
        bmw cars=new bmw();
        cars.carwheel();
        cars.engininfo();
        cars.getdeto();
    }
}
