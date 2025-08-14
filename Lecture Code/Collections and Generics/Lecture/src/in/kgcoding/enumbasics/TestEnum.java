package in.kgcoding.enumbasics;

public class TestEnum{
    public static void main(String[] args) {
        for(Day d: Day.values()){
            System.out.println(d+" ordinal="+d.ordinal());
        }
        Day today = Day.valueOf("MON");
        System.out.println("Today is " + today);

        // 3) name() vs toString()
        System.out.println(today.name());       // "MON"
        System.out.println(today.toString());
    }
}
