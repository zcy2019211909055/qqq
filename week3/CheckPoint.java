package week3;

import java.util.Scanner;

public class CheckPoint {
    public static double len(double x,double y,double x1,double y1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x=cin.nextInt();
        double y=cin.nextInt();
        double length = len(0,0,x,y);
        if(length <=10 ) System.out.println("Point (" 
        + x + ", " + y +") is in the circle");
        else System.out.println("Point (" 
        + x + ", " + y +") is not in the circle");
        cin.close();
    }
}