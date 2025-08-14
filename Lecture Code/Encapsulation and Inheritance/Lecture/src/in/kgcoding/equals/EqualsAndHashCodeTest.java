package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person p1=new Person("Prashanth",31,"001");
        Person p2=new Person("Prashanth",31,"001");
        if(p1.equals(p2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode() );
    }
}
