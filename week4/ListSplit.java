package week4;

import java.util.Scanner;

public class ListSplit {
    public static int partition(int[] list,int n,int point) {
        for(int i=1;i<=n;i++) {
            if(list[i]>point) {
                return i-1;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n=cin.nextInt();
        int[] array = new int[100];
        int[] small = new int[100];
        int[] big = new int[100];
        for(int i=0;i<n;i++) {
            array[i] = cin.nextInt();
        }
        cin.close();
        int point = array[0];
        int num = 0,idx1=0,idx2=0;
        for(int i=0;i<n;i++) {
            if(array[i]<point) {
                small[++idx1]=array[i];
            } else if(array[i] == point) {
                num++;
            } else {
                big[++idx2]=array[i];
            }
        }
        System.out.print("After the partition. the list is");
        int i;
        for(i=1;i<=idx1;i++) {
            System.out.print(" " + small[i]);
        }
        for(i=1;i<=num;i++) {
            System.out.print(" " + point);
        }
        for(i=1;i<=idx2;i++) {
            System.out.print(" " + big[i]);
        }
    }
}