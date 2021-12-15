package week3;

import java.util.Random;

public class RandomMonths {
    public static void main(String[] args) {
        String[] strArray = {"0","January","February",
        "March","April","May","June","July","August",
        "September","Octorber","November","December"};
        Random ran = new Random();
        int number = ran.nextInt(12) + 1;
        System.out.println(number + " " + strArray[number]);
    }
}