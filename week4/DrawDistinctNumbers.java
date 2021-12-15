package week4;

import java.util.Scanner;


public class DrawDistinctNumbers {
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] array = new int[11];
        boolean[] vis = new boolean[11];
        int idx = 0;
        for(int i=0;i<10;i++) {
            int temp = cin.nextInt();
            if(!vis[temp]) {
                array[++idx] = temp;
            }
            vis[temp]=true;
        }
        cin.close();
        System.out.println("The number of distinct number is " + idx);
        System.out.print("The distinct numbers are:");
        for(int i=1;i<=idx;i++) {
            System.out.print(" " + array[i]);
        }
    }
}