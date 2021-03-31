package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            float h;
            float r;
            float vol,area;

            System.out.println("Enter radius and height of a cylinder:");

            r=sc.nextFloat();

            h = sc.nextFloat();

            while ( r <0 && h < 0 ){
                    System.out.println("Numbers cant be negative");

                    r = sc.nextFloat();
                    h = sc.nextFloat();

            }

            vol=(float)22/7*r*r*h;

            area=2*(float)22/7*r*(r+h);

            System.out.println("Volume of cylinder="+vol);

            System.out.println("Total Surface Area="+area);

    }
}
