class Book {
    static int totalBooks=0;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
        {
            totalBooks++;
        }
    Book(String isbn,String author,String title){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalBooks(){
           return totalBooks;
    }
    void borrowBook(){
         if(isBorrowed){
             System.out.println("Book is already Borrowed");
         }
         else{
             isBorrowed=true;
             System.out.println("Enjoy "+this.title+" writen by "+this.author);
             totalBooks--;
         }
    }
    void returnBook(){
            if(isBorrowed){
                isBorrowed=false;
                System.out.println("Hope you enjoyed it");
                totalBooks++;
            }
            else{
                System.out.println("This book is already in the library");
            }
    }

    public static void main(String[] args) {
        Book designOfThings=new Book("1","Vyshu","Unpatience");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
        System.out.println(Book.getTotalBooks());
    }
}
