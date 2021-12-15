/**
 * author: zc
 * date: 2020.12.15
 * description: A TEST ABOUT BINARYFORMAT EXCEPTION OF BINARY TO DECIMAL
 */
package week14;
import java.util.Scanner;

public class BinaryFormatExceptionTest {
    public static void bin2Dec(String binaryString) 
    throws BinaryFormatException {
        int value = 0;
        for(int i:binaryString.toCharArray()) {
            if(i!=48 && i!=49) {
                throw new BinaryFormatException("当前数不符合二进制");
            }
            value = value*2 + i-'0';
        }
        System.out.println("The decimal value for hex number "
        + binaryString + " is " + value);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a binary number: ");
            String bin = input.nextLine();
            bin2Dec(bin);
        } catch (BinaryFormatException ex) {
            System.out.println(ex);
        }
        input.close();
    }
}