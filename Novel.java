class Novel extends Book {
    String title = "Child Book";

    public void showtitles() {
        System.out.println(title);
        System.out.println(super.title);
    }
    @Override
    public void displayInfo() {
        System.out.println("This is a Novel");
    }
}
// Interfaces in Java: It only defines methods that a class must implement, without providing any implementation itself.

Interface Readable {
    void read();
    void bookmark() {
        System.out.println("Bookmarking the page");
    };
}

class Ebook implements Readable {
    public void read() {
        System.out.println("Reading the ebook");
    }
}

class Manga implements Readable {
    public void read() {
        System.out.println("Reading the manga");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new EBook(); // reference type = Book, object type = EBook
        b.showInfo();         // Output: This is an ebook
    }
}
// usage:
// Readable Ebook1 = new Ebook();
// Ebook1.read();
// Ebbok1.bookmark();