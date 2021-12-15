package week3;

import java.util.Random;

public class OptCard {
    public static void main(String[] args) {
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
        System.out.println("The card you picked is "
        + str1 + " of " + str2);
    }
}