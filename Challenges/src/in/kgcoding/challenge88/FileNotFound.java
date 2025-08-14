package in.kgcoding.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        System.out.println("Welcome to file not found exception Hanlding program.\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your file name to display it cotents");
        String fileName=sc.nextLine();
        try(FileReader reader=new FileReader(fileName)){
            int read=0;
            while((read=reader.read())!=-1){
                System.out.printf("%s",(char)read);
            }

        }catch (FileNotFoundException exception){
            System.out.printf("%s not found",fileName);
        }catch (IOException e){
            System.out.println("Exception occured: "+e.getMessage());
        }
    }
}
