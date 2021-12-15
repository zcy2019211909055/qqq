package week4;

import java.util.Scanner;

public class SortStrings {
    public static String sort(String s) {
        int len = s.length();
        char[] ss = s.toCharArray();
        for(int i=0;i<len-1;i++) {
            int idx = i;
            for(int j=i;j<len;j++) {
                 if(ss[j]<ss[idx]) {
                     idx=j;
                 }
            }
            char temp = ss[idx];
            ss[idx] = ss[i];
            ss[i] = temp;
        }
        StringBuffer sss = new StringBuffer();
        for(int i=0;i<len;i++) {
            sss.append(ss[i]);
        }
        return sss.toString();
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        cin.close();
        System.out.println(sort(s));
    }
}