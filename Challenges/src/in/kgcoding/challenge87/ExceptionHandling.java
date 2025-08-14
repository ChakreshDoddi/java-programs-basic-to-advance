package in.kgcoding.challenge87;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division calculator; \n");
        System.out.println("Please enter two numbers: ");
        int first= sc.nextInt();
        int second = sc.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception;
            }
        }
    }
}
