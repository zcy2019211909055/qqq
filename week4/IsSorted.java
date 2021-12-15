package week4;

import java.util.Scanner;


public class IsSorted {
    public static boolean isSorted(int len,int[] list) {
        for(int i=0;i<len-1;i++) {
            if(list[i]>list[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n = cin.nextInt();
        int[] array = new int[100];
        for(int i=0;i<n;i++) {
            array[i] = cin.nextInt();
        }
        cin.close();
        System.out.println(isSorted(n,array) ?
        "The list is already sorted" :
        "The list is not sorted");
    }
}