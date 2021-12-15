package week4;

public class LockerProblems {
    public static void main(String[] args) {
        int[] array = new int[110];
        int idx = 1;
        while(idx!=101) {
            for(int i=idx;i<=100;i+=idx) {
                array[i] ^= 1;
            }
            idx++;
        }
        System.out.print("The answer is:");
        for(int i=1;i<=100;i++) {
            if(array[i]==0)continue;
            System.out.print(" " + i);
        }
    }
}