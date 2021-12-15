package week10;

import java.util.Scanner;


public class AreaOfConvexPolygon {

    public static void main(String[] args) {
        System.out.print("Enter the number of the points: ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println("Enter the coordinates of the points: ");
        Point[] p = new Point[100];
        double x,y;
        for(int i=1;i<=n;i++) {
            x = cin.nextDouble();
            y = cin.nextDouble();
            p[i] = new Point(x,y);
        }
        cin.close();
        double res = 0;
        for(int i=2;i<n;i++) {
            res += getArea(p[1],p[i],p[i+1]);
        }
        System.out.println(res);
    }

    public static double getArea(Point a, Point b, Point c) {
        return  ((b.getPointY() - a.getPointY()) * (c.getPointX() - a.getPointX())  - 
                 (b.getPointX() - a.getPointX()) * (c.getPointY() - a.getPointY())) /2;
    }

}

class Point {
    private double x, y;

    public Point() {
    }
    public Point(double a,double b) {
        this.x = a;
        this.y = b;
    }
    public void setPoint(double a,double b) {
        this.x = a;
        this.y = b;
    }
    public double getPointX() {
        return x;
    }
    public double getPointY() {
        return y;
    }
}