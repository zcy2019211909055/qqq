/**
 * author: zc
 * date: 2020.12.22
 * description: implement File transfer of IOStream
 */

package week15;
import java.io.*;

public class IOStreamTest {
    public static void main(String[] args) throws IOException{
        InputStream in = new FileInputStream("java/week15/test1.txt");
        OutputStream out = new FileOutputStream("java/week15/test2.txt");
        try {
            byte[] res = new byte[256];
            while(true) {
                int byteRead = in.read(res);
                if(byteRead==-1)break;
                out.write(res,0,byteRead);
            }
        } catch(IOException ex) {
            System.out.println(ex.toString());
        }
        in.close();
        out.close();
    }
}