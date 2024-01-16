public class Book {
    
    String name;
    String author;
    int totalPages;
    int bookmarkedPage;

    void status() {
        System.out.println(
            "Name of Book: " + this.name + "\n" +
            "Author: " + this.author + "\n" +
            "Total Pages: " + this.totalPages + "\n" +
            "Bookmarked Page: " + this.bookmarkedPage + "\n"
        );
    }
    
    void mark(int page) {
        if (page <= totalPages && page > 0) this.bookmarkedPage = page;
        else System.out.println("Error to change bookmark page");
    }

}