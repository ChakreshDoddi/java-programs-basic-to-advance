package in.kgcoding.challenge96;

public enum Day {

    MON("Weekday"),
    TUE("Weekday"), WED("Weekday"), THU("Weekday"), FRI("Weekday"), SAT("Weekend"), SUN("Weekend");
    private String dayType;
    Day(String s){
        this.dayType=s;
    }
    public String getDayType(){
        return dayType;
    }
}
