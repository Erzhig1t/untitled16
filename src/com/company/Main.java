package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmer programmer = new Programmer("Asan", "Java developer", "Microsoft" );
        System.out.println(programmer);

        Singer singer = new Singer("Mirbek", "Pop star", "Gorod 312");
        System.out.println("\n"+singer);

        Dancer dancer = new Dancer("Nurbek", "Break dancer", "Star");
        System.out.println("\n"+dancer);
    }
}
