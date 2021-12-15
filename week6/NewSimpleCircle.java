package week6;

public class NewSimpleCircle {
    public static void main(String[] args) {
        NewSimpleCircle circle1 = new NewSimpleCircle();
        
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        
        NewSimpleCircle circle2 = new NewSimpleCircle(25);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());

        NewSimpleCircle circle3 = new NewSimpleCircle(125);
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());

    }
    
    double radius;
    NewSimpleCircle() {
        radius = 1;
    }

    NewSimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2*radius*Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}