package week8;

import java.util.*;

public class SimpleGeometricObjcet {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObjcet() {
        dateCreated = new Date();
    }

    public SimpleGeometricObjcet(String color,boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled; 
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "create on " + dateCreated + "\ncolor: " +
        color + " and filled: " + filled; 
    }    
}
