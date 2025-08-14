package in.kgcoding.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Chakresh.txt");
        fw.write("Hello, I am Chakresh");
        fw.close();
        FileReader fwr=new FileReader("Chakresh.txt");
        int i;
        while((i= fwr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
