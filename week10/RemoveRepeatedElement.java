package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveRepeatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for(int i=1;i<=10;i++) {
            arr.add(cin.nextInt());
        }
        cin.close();
        removeDuplicate(arr);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> resArr = new ArrayList<Integer>();
        System.out.print("The distinct integers are ");
        for(int i : list) {
            if(!resArr.contains(i)) {
                resArr.add(i);
                System.out.print(i + " ");
            }
        }
    }
}