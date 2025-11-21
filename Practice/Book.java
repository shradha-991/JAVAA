public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    public boolean isAvailable() {
        return isAvailable;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book already issued: " + title);
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued: " + title);
        }
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        book1.showDetails();
        book1.issueBook();
        book1.issueBook(); 
        book1.returnBook();
        book1.returnBook(); 
        book1.showDetails();
    }
}