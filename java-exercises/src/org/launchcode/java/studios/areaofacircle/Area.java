package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double radius;
        String userInput;
        Boolean validInput = false;
        do {
            System.out.println("Enter a radius: ");
            userInput = input.nextLine();
            try {
                radius = Double.parseDouble(userInput);
                Double area = Circle.getArea(radius);
                if(radius > 0){
                    validInput = true;
                    System.out.println("The area of a circle of radius 2.5 is: " + area);
                }
                else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e){
                System.out.println(e);
            }
        } while(!validInput);


    }
}
