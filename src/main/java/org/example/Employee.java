package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id,String fullName, String email, String password,String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthplans;
    }
    public void addHealthPlan(int index,String name){
        if(healthPlans.length>index&&index>=0){
            if (healthPlans[index] == null )
            {
                healthPlans[index]=name;
            }else{
                System.out.println("ilgili index dolu!");
            }
        }


    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String[] getHealthPlans(){
        return healthPlans;
    }
    public void setHealthPlans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public String toString(){
        return ("id: "+id+" FullName: "+fullName+" Email: "+email+" Password: "+password+" Healthplans: " + Arrays.toString(healthPlans));
    }

}
