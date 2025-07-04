package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro=(giro<0)?0:giro;
        this.developerNames = developerNames;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getGiro(){
        return giro;
    }
    public void setGiro(double giro){
        this.giro=(giro<0)?0:giro;

    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    public void addEmployee(int index, String name) {
        if(developerNames.length>index&&index>=0){
            if (developerNames[index] == null)
            {
                developerNames[index]=name;
            }else{
                System.out.println("ilgili index dolu!");
            }
        }
    }

    public String toString() {
        return ("id: " + id + " Name: " + name + " Giro: " + giro + " Developer Names: " + Arrays.toString(developerNames));
    }
}
