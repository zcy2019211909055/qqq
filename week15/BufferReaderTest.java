/**
 * author: zc
 * date: 2020.12.22
 * description: implement File transfer of Buffer
 */
package week15;

import java.io.*;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("java/week15/test1.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("java/week15/test2.txt"));
        String temp;
        while((temp = in.readLine())!=null) {
            out.write(temp);
            out.newLine();
        }
        in.close();
        out.close();
    }
}