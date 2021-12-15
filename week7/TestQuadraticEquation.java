package week7;

import java.util.*;


public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input three numbers of a,b,c: ");
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        cin.close();
        QuadraticEquation T = new QuadraticEquation(a,b,c);
        if(T.getDiscriminant() == 0) {
            System.out.println(T.getRoot1());
        } else if (T.getDiscriminant() > 0) {
            System.out.println(T.getRoot1() + " " + T.getRoot2());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
    
}