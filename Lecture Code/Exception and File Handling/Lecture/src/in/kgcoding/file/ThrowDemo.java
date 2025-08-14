package in.kgcoding.file;

import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo {
//    public static void main(String[] args) throws IOException {
//        int age=15;
//        readFile();
////        if(age<18){
////            throw new ArithmeticException("You are not eligible to vote: ");
////        }
////        else{
////            System.out.println("You are eligible");
////        }
//    }
//    static void readFile() throws IOException {
//        throw new IOException("Hiii");
//    }
//static void readFile() throws IOException {
//    FileReader fr = new FileReader("abc.txt");
//    fr.read();
//    fr.close();
//}
//
//    public static void main(String[] args) {
//        try {
//            readFile();
//        } catch (IOException e) {
//            System.out.println("File error: " + e.getMessage());
//        }
//    }
static void validate(int age) throws ArithmeticException {
    if (age < 18)
        throw new ArithmeticException("Not eligible");
}

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
