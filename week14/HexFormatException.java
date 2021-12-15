/**
 * author: zc
 * date: 2020.12.15
 * description: MAKE A CUSTOM HEXFORMAT EXCEPTION
 */
package week14;


public class HexFormatException extends Exception {
    private static final long serialVersionUID = 1; //不加会报warning

    public HexFormatException(String message) {
        super(message);
    }
}