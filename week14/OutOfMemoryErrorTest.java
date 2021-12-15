/**
 * author: zc
 * date: 2020.12.15
 * description: A TEST TO MAEK A OUTOFMEMORYERROR AND CATCH IT 
 */
package week14;
import java.util.ArrayList;

public class OutOfMemoryErrorTest {
    public static void main(String[] args) throws RuntimeException{
        ArrayList<String> a = new ArrayList<String>();
        try {
            while(true) {
                a.add("12345");
            }
        } catch(Exception ex) {
            System.exit(0);
        }
    }
}