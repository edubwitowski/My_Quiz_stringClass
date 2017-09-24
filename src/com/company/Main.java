package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String nope = "Try Again";
        Scanner input = new Scanner(System.in);
        System.out.println("Eric little quiz");

        System.out.println("");

        System.out.println("('Yes' or 'No' only)");
        System.out.println("");
        System.out.println("An avocado is fruit Yes or No ?      ");

        String a = input.next();

        if(a.equalsIgnoreCase("yes")){
            System.out.println("You are Correct");
        }
        else if(a.equalsIgnoreCase("no")){
            System.out.println(nope);
        }
        else{
            System.out.println("Incorrect Input " + a + " only this please 'Yes' or 'No' ");
        }
        System.out.println("");

        System.out.println("The sport of Baseball has a diamond?     ");
        String e = input.next();

        if(e.equalsIgnoreCase("yes")){
            System.out.println("true");
        }
        else if(e.equalsIgnoreCase("no")){
            System.out.println(nope);

        }
        else{
            System.out.println("Incorrect Input " + e + " only this please'Yes' or 'No'");
        }

        System.out.println("");

        System.out.println("BaseBall has 9 innings? Yes or No?    ");
        String g = input.next();

        if(e.equalsIgnoreCase("yes")){
            System.out.println("true");
        }
        else if(e.equalsIgnoreCase("no")){
            System.out.println(nope);

        }
        else{
            System.out.println("Incorrect Input " + g + " only this please 'Yes' or 'No'");
        }

        System.out.println("");


        System.out.println("Basball has an Umpire near Second Base T or F:  ?    ");
        String h = input.next();

        if(e.equalsIgnoreCase("yes")){
            System.out.println("true");
        }
        else if(e.equalsIgnoreCase("no")){
            System.out.println(nope);

        }
        else{
            System.out.println("Incorrect Input " + h + " only this please 'Yes' or 'No'");
        }
    }
}



