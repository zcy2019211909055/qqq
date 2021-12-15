package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowAndColumn {
    public static void main(String[] args) {
        System.out.print("Enter the array size n: ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.close();
        int[][] arr = new int[n][n];
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        System.out.println("The random array is");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]= (int)(Math.random()*2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int mxrow=0,mxcolumn=0,sumrow=0,sumcolumn=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                sumrow += arr[i][j];
                sumcolumn += arr[j][i];
            }
            mxrow = Math.max(sumrow, mxrow);
            mxcolumn = Math.max(sumcolumn,mxcolumn);
            sumrow = sumcolumn = 0;
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                sumrow += arr[i][j];
                sumcolumn += arr[j][i];
            }
            if(sumrow==mxrow) row.add(i);
            if(sumcolumn==mxcolumn) column.add(i);
            sumrow = sumcolumn = 0;
        }
        System.out.print("The largest row index: ");
        System.out.println(row.toString());
        System.out.print("The largest column index: ");
        System.out.println(column.toString());
    }
}