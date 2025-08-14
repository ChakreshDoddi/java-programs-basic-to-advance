package in.kgcoding.challenge85;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(5,6));
        System.out.println(cal.add(5,6,7));
        System.out.println(cal.add(4.5,6.9));
    }
}
