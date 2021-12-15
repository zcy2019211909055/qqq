package week3;

import java.util.Scanner;

public class JudgeTriangle {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter three edges: ");
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("Triangle is valid");
            System.out.println("and the Perimetre is " + (a+b+c));
        } else {
            System.out.println("Triangle is not valid");
        }
        cin.close();
    }
}