package week4;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("the numbers of list: ");
        int n = cin.nextInt();
        System.out.print("Enter list: ");
        double[] array = new double[100];
        for(int i=0;i<n;i++) {
            array[i] = cin.nextDouble();
        }
        cin.close();
        for(int i=0;i<n-1;i++) {
            for(int j=n-2;j>=i;j--) {
                if(array[j]>array[j+1]) {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print("The list is:");
        for(int i=0;i<n;i++) {
            System.out.print(" " + array[i]);
        }
    }
}