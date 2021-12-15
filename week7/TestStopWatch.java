package week7;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        int[] num = new int[100010];
        Random random = new Random(1000);
        for(int i=1;i<=100000;i++) {
            num[i] = random.nextInt(1000);
        }
        StopWatch clock = new StopWatch();
        clock.start();
        for(int i=1;i<=100000;i++) {
            int idx = i;
            for(int j=i+1;j<=100000;j++) {
                if(num[j]<num[idx]) {
                    idx = j;
                }
            }
            int temp = num[idx];
            num[idx] = num[i];
            num[i] = temp;
        }
        clock.stop();
        System.out.println(clock.getElapsedTime());
    }
}