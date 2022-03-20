package com.company;

public class Singer extends Person {
    private String groupName;

    public Singer(String name, String designation, String groupName){
        super(name, designation);
        this.groupName = groupName;
    }
    void setGroupName(){
        this.groupName = groupName;
    }
    String getGroupName(){
        return groupName;
    }
    public void singing(){
        System.out.println("He is singing");
    }
    @Override
    public String toString(){
        return "Singer name is: " + super.getName() + "\n" +
                "Singer designation is: " + super.getDesignation() + "\n" +
                "Singer group name is: " + groupName;
    }
}
