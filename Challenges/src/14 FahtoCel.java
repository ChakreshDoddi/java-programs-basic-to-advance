import java.util.Scanner;

class FahtoCel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit to Celsius Converter: \n\n");
        System.out.print("Now, please enter the temperature in fahrenheit: ");
        float fahrenheit=sc.nextFloat();
        float celsius=(fahrenheit-32)*5.0f/9.0f;
        System.out.println("Converting Fahrenheit to Celsuis....."+"\n"+celsius);
    }
}
