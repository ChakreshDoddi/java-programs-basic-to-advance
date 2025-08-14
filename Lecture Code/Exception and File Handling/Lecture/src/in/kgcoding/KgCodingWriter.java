package in.kgcoding;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String fileName="java-course.txt";
        try(FileWriter writer=new FileWriter(fileName)) {
            writer.write("This is the best java course.\n");
            for(int i=1;i<=1000;i++){
                writer.write("* ");
            }
            writer.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException e){
            System.out.println("Exception occurred"+
            e.getMessage());
        }
    }
}
