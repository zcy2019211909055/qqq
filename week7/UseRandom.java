package week7;

import java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i=1;i<=50;i++) {
            System.out.println(random.nextInt(100));
        }
    }    
}