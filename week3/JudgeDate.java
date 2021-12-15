package week3;

import java.util.Scanner;

public class JudgeDate {
    public static void main(String[] args) {
        String date[] = {"Saturday","Sunday","Monday",
        "Tuesday","Wednesday","Thursday","Friday"};
        Scanner cin = new Scanner(System.in);
        int y,m,q,h,k,j;
        System.out.println("Enter year: (e.g., 2012): ");
        y = cin.nextInt();
        System.out.println("Enter month: 1-12: ");
        m = cin.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        q = cin.nextInt();
        cin.close();
        if(m == 1 || m == 2) {
            y -=1;
            m += 12;
        }
        k = y % 100;
        j = Math.abs(y/100);
        h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j)%7;
        System.out.println(date[h]);
    }
}