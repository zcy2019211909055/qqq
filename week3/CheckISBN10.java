package week3;

import java.util.Scanner;

public class CheckISBN10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the first 9 digits"
        + " of an ISBN as integer: ");
        int sum = 0;
        String str = cin.next();
        for(int i = 0;i < 9;i++) {
            sum += (str.charAt(i)- 48) * (i+1);
        }
        System.out.println("The ISBN-10 number is " +
         (sum%11==10?str + "X":str + sum%11));
        cin.close();
    }
}