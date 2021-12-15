package week3;

import java.util.Scanner;

public class CheckPoint2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a point's x- " +
        "and y-coordinates: ");
        double x = cin.nextDouble();
        double y = cin.nextDouble();
        cin.close();
        if(-x/2 + 100 >= y && x>=0 && y>=0) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}