package week4;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] array = new int[110];
        System.out.println("Enter the integers between 1 and 100: ");
        while(true) {
            int temp = cin.nextInt();
            if(temp == 0)break;
            array[temp]++;
        }
        cin.close();
        for(int i = 1; i <= 100; i++) {
            if(array[i] == 0)continue;
            System.out.println(i + " occurs " + array[i] +" times");
        }
    }
}