package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            float radius,height,vol,area;

            System.out.println("Enter radius and height of a cylinder:");

            radius=sc.nextFloat();

            height=sc.nextFloat();

            vol=(float)22/7*radius*radius*height;

            area=2*(float)22/7*radius*(radius+height);

            System.out.println("Volume of cylinder="+vol);

            System.out.println("Total Surface Area="+area);








    }
}
