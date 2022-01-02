import java.io.*;
import java.util.Collections;
import java.util.TreeMap;

public class ByteArrayPractice {

    public static void main(String[] args) throws IOException{
        OutputStream foo = new FileOutputStream("array.txt");//creating a file txt.
        OutputStream frg = new FileOutputStream("index.html");//creating a file txt.
        byte[] inputs = {'A','B','C','D'};
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        foo.write(inputs); // what to write
        arr.writeTo(foo); // where to write

         // reading the file
           ByteArrayInputStream file = new ByteArrayInputStream(inputs);
            for (int i = 0; i < inputs.length; i++) {
                System.out.print((char) file.read()+ ",");
            }

    }
}

