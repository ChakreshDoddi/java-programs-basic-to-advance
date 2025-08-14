public class StringFormat {
    public static void main(String[] args) {
        String name="Ashish";
        int marks=4588554;
        System.out.println("Hello "+name+", your marks are: "+marks);
        System.out.printf("Hello %S, your marks are: %,d",name, marks);
        StringBuilder sentence=new StringBuilder("This is my sentence");
        sentence.append("new word");
        System.out.println(sentence);
    }
}
