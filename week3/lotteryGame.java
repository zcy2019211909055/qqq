package week3;

import java.util.Random;
import java.util.Scanner;

public class lotteryGame {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random ran = new Random();
        int lottery = ran.nextInt(1000);
        int[] a = new int[5];
        a[1] = lottery / 100;
        a[2] = lottery / 10 %10;
        a[3] = lottery % 10;
        System.out.println("lottery is " + a[1] + a[2] + a[3]);
        System.out.println("Enter three digit integer");
        int number = cin.nextInt();
        cin.close(); 
        int[] b = new int[5];
        b[1] = number / 100;
        b[2] = number /10 %10;
        b[3] = number % 10;
        boolean ordermatch = true;
        int match=0;
        int i,j;
        for(i=1;i<=3;i++) {
            if(a[i]!=b[i]) {
                ordermatch = false;
            }
        }
        for(i=1;i<=3;i++) {
            for(j=1;j<=3;j++) {
                if(a[j]==b[i]) {
                    match++;
                    break;
                }
            }
        }
        if(ordermatch) {
            System.out.println("You win 10000 dollar");
        } else if(match==3) {
            System.out.println("You win 3000 dollar");
        } else if(match>=1){
            System.out.println("You win 1000 dollar");
        }
    }
}