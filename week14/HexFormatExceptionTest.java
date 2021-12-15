/**
 * author: zc
 * date: 2020.12.15
 * description: A TEST ABOUT MAKE A CUSTOM HEXFORMATEXCEPTION
 */

package week14;
import java.util.*;

public class HexFormatExceptionTest {
    public static int hexCharToDecimal(char ch) {
        if(ch>='A' && ch<='F')return 10 + ch-'A';
        return ch-'0';
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for(int i = 0;i<hex.length();i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16+hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static void Hex2Dec() throws HexFormatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();
        input.close();
        char[] a = new char[100];
        a = hex.toCharArray();
        for(int i : a) {
            if(i>='0'&& i<='9' || i>='A' && i<='F' )continue;
            throw new HexFormatException("当前数不符合十六进制");
        }
        System.out.println("The decimal value for hex number "
        + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static void main(String[] args) {
        try {
            Hex2Dec();
        } catch(HexFormatException ex) {
            System.out.println(ex);
        }
    }
}