package in.kgcoding;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.println("Please enter your two numbers");
        int first=sc.nextInt();
        int second=sc.nextInt();
        try {
//            int result = first / second;
//            System.out.printf("Result is %d", result);
            int[] arr= new int[5];
            System.out.println(arr[6]);
            arr[6]=first/second;
        }catch(ArithmeticException e){
            System.out.printf("%s ",e.getMessage());
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array is out of bound. "+exception.getStackTrace());
        } catch (Throwable th){
            System.out.println("general Exception");
        }
        }

    }
