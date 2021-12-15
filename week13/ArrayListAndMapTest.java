/**
 * author: zc
 * date: 2020.12.8
 * description: A TEST ABOUT ARRALIST AND MAP 
 */
package week13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 定义商品book的attributes */
class book {
    private String name;
    private double price;
    private String press;
    public book() {
    }
    public book(String name,double price,String press) {
        this.name = name;
        this.price = price;
        this.press = press;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPress(String press) {
        this.press = press;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getPress() {
        return this.press;
    }
}

/** 
 * 使用ArrayList和Map存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社；并使用商品编号作为映射中的key
 * 有点类似于HashMap，通过MAP映射到对应的某个ArrayList，然后遍历这个ArrayList
 */
public class ArrayListAndMapTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<Integer,ArrayList<book>> mp = new HashMap<Integer,ArrayList<book>>();
        System.out.println("number of books is: ");
        int n = cin.nextInt();
        for(int i=1;i<=n;i++) {
            ArrayList<book> a = new ArrayList<book>();
            System.out.println("index of commodity is: ");
            int idx  = cin.nextInt();
            System.out.println("name of commodity is: ");
            String name = cin.next();
            System.out.println("price of commodity is: ");
            double price = cin.nextDouble();
            System.out.println("press of commodity is: ");
            String press = cin.next();
            a.add(new book(name,price,press));
            mp.put(idx, a);
        }
        cin.close();

        /** 遍历MAP和MAP中的ARRAYLIST */
        for(Map.Entry<Integer,ArrayList<book>> entry: mp.entrySet()) {
            System.out.println("----------- book index is " + entry.getKey() + " ------------");
            for(book i:entry.getValue()) {
                System.out.println("book name is " + i.getName());
                System.out.println("book price is " + i.getPrice());
                System.out.println("book press is " + i.getPress());
            }
        }
    }
}