package week7;

import java.util.*;


public class UseDate {    
    public static void main(String[] args) {
        for(int i=4;i<=11;i++) {
            long j = (long)Math.pow(10,i);
            System.out.println(j);
            Date date = new Date(j);
            System.out.println(date.toString());
        }
    }
}