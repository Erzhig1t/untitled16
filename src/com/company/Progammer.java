package com.company;

class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName){
        super(name, designation);
        this.companyName = companyName;

    }
    void setCompanyName(){
        this.companyName = companyName;
    }
    String getCompanyName(){
        return companyName;
    }
    public void coding(){
        System.out.println("He is coding");
    }
    @Override
    public String toString(){
        return "Programmer name is: " + super.getName() + "\n" +
                "Programmer designation is: "  + super.getDesignation() + "\n" +
                "Programmer company name is: " + getCompanyName();

    }
}
