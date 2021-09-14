/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        double ratio = 0;
        System.out.println( "Enter a 1 is you are male or a 2 if you are female: " );
        double gender = sc.nextDouble();
        System.out.println( "How many ounces of alcohol did you have? " );
        double alcohol  = sc.nextDouble();
        System.out.println( "What is your weight, in pounds?" );
        double weight = sc.nextDouble();
        System.out.println( "How many hours has it been since your last drink?" );
        double hours = sc.nextDouble();

        if(gender == 1)
        {
            ratio = 0.73;
        }
        else
        {
            ratio = 0.66;
        }
        double BAC = (alcohol * 5.14 / weight * ratio) - 0.015 * hours;
        System.out.println( "Your BAC is " + BAC);
        if(BAC > 0.08)
        {
            System.out.println( "it is not legal for you to drive");
        }
        else
        {
            System.out.println( "it is legal for you to drive");
        }
    }
}
