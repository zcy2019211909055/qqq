package week4;

import java.util.Scanner;
import java.util.Arrays;


class Table implements Comparable<Table>{
    String name;
    int scores;
    public int compareTo(Table x) {
        int temp = this.name.compareTo(x.name);
        return this.scores - x.scores==0?temp:-this.scores+x.scores;
    }
}

public class SortStudents {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Table array[] = new Table[100];
        System.out.print("Enter the numbers of students: ");
        int n = cin.nextInt();
        System.out.println("Enter the name and score of student: ");
        for(int i=0;i<n;i++) {
            array[i] = new Table();
            array[i].name = cin.next();
            array[i].scores = cin.nextInt();
        }
        cin.close();
        Arrays.sort(array,0,n);
        for(int i=0;i<n;i++) {
            System.out.println(array[i].name + " " + array[i].scores);
        }
    }
}