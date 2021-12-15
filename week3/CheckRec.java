package week3;

import java.util.Scanner;

public class CheckRec {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x=cin.nextDouble();
        double y=cin.nextDouble();
        if(Math.abs(x)<=5 && Math.abs(y)<=2.5) System.out.println("Point (" 
        + x + ", " + y +") is in the rectangle");
        else System.out.println("Point (" 
        + x + ", " + y +") is not in the rectangle");
        cin.close();
    }
}