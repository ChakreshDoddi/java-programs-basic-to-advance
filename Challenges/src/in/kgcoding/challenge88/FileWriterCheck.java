package in.kgcoding.challenge88;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCheck {


    public static void main(String[] args) {
        String fileName="C:\\Users\\chakr\\IdeaProjects\\Java_Complete_Youtube\\Challenges\\Challenges\\src\\in\\kgcoding\\file-writer.txt";
        try(FileWriter writer=new FileWriter(fileName)){
            writer.write("Hello, welcome to FileWriter Documentation: ");
        }catch(IOException e){
            System.out.println("Exception occurred "+e.getMessage());
        }
    }
}
