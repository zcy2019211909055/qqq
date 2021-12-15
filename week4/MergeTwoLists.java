package week4;

import java.util.Scanner;

public class MergeTwoLists {
    public static int[] merge(int n,int m,int[] list1, int[] list2) {        
        int[] ans = new int[210];
        int i=0,j=0,idx=0;
        while(i!=n && j!=m) {
            if(list1[i]<=list2[j]) {
                ans[++idx] = list1[i++];
                continue;
            }
            ans[++idx] = list2[j++];
        }
        while(i!=n) { ans[++idx] = list1[i++]; }
        while(j!=m) { ans[++idx] = list2[j++]; }
        return ans;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int n = cin.nextInt();
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for(int i=0;i<n;i++) {
            array1[i] = cin.nextInt();
        }
        System.out.print("Enter list2: ");
        int m = cin.nextInt();
        for(int i=0;i<m;i++) {
            array2[i] = cin.nextInt();
        }
        cin.close();
        int[] res = merge(n,m,array1,array2);
        System.out.print("The merged list is");
        for(int i=1;i<=n+m;i++) {
            System.out.print(" " + res[i]);
        }
    }
}