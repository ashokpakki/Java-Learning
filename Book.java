class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println(title + "by" + author);
    }
    //Overloaded method
    public void displayInfo(String publisher) {
        System.out.println(title + "by" + author + "Published by" + publisher);

    }
}

public static void main(String[] args) {
    Book book1 = new Book("Index", "Kamachi");
    book1.displayInfo();
    book1.displayInfo("Kino Publications");
}
