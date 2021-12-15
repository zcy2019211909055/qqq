/**
 * author: zc
 * date: 2020.12.15
 * description: MAKE A CUSTOM BINARYFORMAT EXCEPTION
 */

package week14;

public class BinaryFormatException extends Exception{
    private static final long serialVersionUID = 1L;

    public BinaryFormatException(String message) {
        super(message);
    }
}