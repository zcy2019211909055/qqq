package week3;

import java.util.Scanner;

public class CheckTwoCircles {
    public static double length(double x,double y,double x1,double y1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));    
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter circle1's center" +
        " x-, y-coordinates, and radius: ");
        double x1,y1,r1,x2,y2,r2;
        x1 = cin.nextDouble();
        y1 = cin.nextDouble();
        r1 = cin.nextDouble();
        System.out.println("Enter circle2's center" +
        " x-, y-coordinates, and radius: ");
        x2 = cin.nextDouble();
        y2 = cin.nextDouble();
        r2 = cin.nextDouble();
        cin.close();
        double len = length(x1,y1,x2,y2);
        if(len <= Math.abs(r1-r2)) {
            System.out.println("circle2 is inside circle1");
        } else if(len <= r1+r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}