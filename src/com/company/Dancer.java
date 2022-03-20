package com.company;

public class Dancer extends Person{
    private String bandName;
    public Dancer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;
    }
    void setBandName(String bandName){
        this.bandName = bandName;
    }
    String getBandName(){
        return bandName;
    }
    public void Dancing(){
        System.out.println("He is dancing");
    }
    @Override
    public String toString(){
        return "Dancer name is: " + super.getName() + "\n" +
                "Dancer designation is: " + super.getDesignation() + "\n" +
                "Dancer band name is: " + getBandName();
    }

}
