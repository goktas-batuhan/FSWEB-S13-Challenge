package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] abc={"abc","bca","dca","acd"};
        Company bago = new Company(123,"goba",123123,abc);
        Healthplan goba = new Healthplan(321,"batuhan", Plan.BASIC);
        Employee yildirim= new Employee(1234,"Yıldırım G. Güldoğan","yıldırımG@guldogan.com", "123456", abc);
        System.out.println(bago);
        System.out.println(goba);
        System.out.println(yildirim);
    }
}