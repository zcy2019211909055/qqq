package week7;

import java.util.*;

public class TestLinerEquation {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the numbers of a,b,c,d,e,f: ");
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        double d = cin.nextDouble();
        double e = cin.nextDouble();
        double f = cin.nextDouble();
        cin.close();
        LinearEquation L = new LinearEquation(a, b, c, d, e, f);
        if(L.isSolvable()) {
            System.out.println(L.getX() + " " + L.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}