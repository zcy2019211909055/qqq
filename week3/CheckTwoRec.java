package week3;

import java.util.Scanner;

public class CheckTwoRec {
    public static void main(String[] args) {
        double x1,y1,w1,h1,x2,y2,w2,h2;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter r1's center x-, "
        + "y-coordinates, width, and height: ");
        x1 = cin.nextDouble();
        y1 = cin.nextDouble();
        w1 = cin.nextDouble();
        h1 = cin.nextDouble();
        System.out.println("Enter r2's center x-, "
        + "y-coordinates, width, and height: ");
        x2 = cin.nextDouble();
        y2 = cin.nextDouble();
        w2 = cin.nextDouble();
        h2 = cin.nextDouble();
        cin.close();
        double l1 = x1 - w1/2, r1 = x1 + w1/2;
        double l2 = x2 - w2/2, r2 = x2 + w2/2;
        double up1 = y1 + h1/2, down1 = y1 - h1/2;
        double up2 = y2 + h2/2, down2 = y2 - h2/2;
        if(up2<=up1 && l2>=l1 && down2>=down1 && r2<=r1) {
            System.out.println("r2 is inside r1");
        } else if(r2 < l1 || down2 > up1 || l2 > r1 || up2 < down1) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlap r1");
        }
    }
}