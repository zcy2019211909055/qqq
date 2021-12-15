package week7;

import java.util.*;

public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar G = new GregorianCalendar();
        System.out.println(G.get(GregorianCalendar.YEAR)
        + " " + G.get(GregorianCalendar.MONTH)
        + " " + G.get(GregorianCalendar.DAY_OF_MONTH));
        G.setTimeInMillis(1234567898765L);
        System.out.println(G.get(GregorianCalendar.YEAR)
        + " " + G.get(GregorianCalendar.MONTH)
        + " " + G.get(GregorianCalendar.DAY_OF_MONTH));
    }
}