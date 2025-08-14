package in.kgcoding.challenge96;

public class PrintAllDays {
    public static void main(String[] args) {
        for(Day c: Day.values()){
            System.out.println(c+" "+c.getDayType());
        }

    }
}
