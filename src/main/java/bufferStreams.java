import java.io.*;

public class bufferStreams {
    public static void main(String[] args) throws IOException {

        String filepath = "/Users/decagon/IdeaProjects/class_practice/class.txt";

        BufferedWriter read = new BufferedWriter(new FileWriter(filepath));
        read.write("fail to plan, plan to fail");
        read.close();


        BufferedReader write = new BufferedReader (new FileReader(filepath));
        String foo;
        while ((foo = write.readLine()) != null) {
            System.out.println(foo);
        }
        write.close();
    }

}
