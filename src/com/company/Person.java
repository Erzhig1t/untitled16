package com.company;

public class Person {
    private String name;
    private String designation;

    public Person( String name, String designation){
        this.name = name;
        this.designation = designation;
    }
    String getName(){
        return name;
    }
    String getDesignation(){
        return designation;
    }


    public void learn(){
        System.out.println("He is learning");
    }

    public void walk(){
        System.out.println("He is walking");

    }
    public void eat() {
        System.out.println("He is eating");
    }
}
