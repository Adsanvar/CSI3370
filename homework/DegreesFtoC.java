package edu.oakland.solutions.homework;

import java.util.*;

public class DegreesFtoC{

    public static void main(String[] args)
    {
        int temperature;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrentheit:");
        temperature = in.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("temperature in Celsius = " + temperature);
    }


}