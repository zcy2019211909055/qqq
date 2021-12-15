/**
 * author: zc
 * date: 2020.12.8
 * description: A TEST ABOUT TREESET
 */

package week13;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;


/** 定义Student类并按照年龄升序排序 */
class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int age;
    public Student() {
    }
    public Student(String id,String name,int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public int getAge() {
        return this.age;
    }
    public int compareTo(Student stu) {
        if(this.age > stu.age) return 1;
        return -1;
    }
}

/** 将数据存入Student然后将每个Student存入Set中,然后遍历Set并输出到记事本中 */
public class SetAndSortStudentInformation {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        File file =new File("java\\week13\\output.txt");
		Writer out =new FileWriter(file);
        Set<Student> s = new TreeSet<Student>();
        while(true) {
            System.out.println("Input three attributes of student: id + name + age");
            String id = cin.next();
            if(id.equalsIgnoreCase("exit"))break;
            String name = cin.next();
            int age = cin.nextInt();
            s.add(new Student(id,name,age));
        }
        cin.close();
        for(Student i:s) {
            out.write("Student id: "+i.getId()+" Student name: " + i.getName() + " Student age: "+i.getAge()+'\n');
        }
        out.close();
    }
}