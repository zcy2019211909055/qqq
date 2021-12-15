package week4;

import java.util.*;

public class CouponCollectorProblem {
    public static void main(String[] args) {
        boolean[] vis = new boolean[5];
        int num=0;
        int tot=0;
        while(true) {
            tot++;
            Random ran = new Random();
            int size = ran.nextInt(13)+1;
            int color = ran.nextInt(4)+1;
            String str1,str2;
            if(size == 1) {
                str1 = "Ace";
            } else if(size == 11 ) {
                str1 = "Jack";
            } else if(size == 12) {
                str1 = "Queen";
            } else if(size == 13) {
                str1 = "King";
            } else {
                str1 = Integer.toString(size);
            }
            if(color == 1) {
                str2 = "Clubs";
            } else if (color == 2) {
                str2 = "Diamonds";
            } else if(color == 3) {
                str2 = "Hearts";
            } else {
                str2 = "Spades";
            }
            if(!vis[color]) {
                System.out.println(str1 + " of " + str2);
                num++;
            }
            vis[color] = true;
            if(num==4) {
                System.out.println("Number of picks: " + tot);
                break;
            }
        }
    }
}