public class Book implements Publication {
    private String title;
    private String author;
    private int totalPage;
    private int currentPage;
    private boolean open;
    private Person reader;

    public Book(String newTitle, String newAuthor, int newTotalPage, Person reader) {
        this.setTitle(newTitle);
        this.setAuthor(newAuthor);
        this.setTotalPage(newTotalPage);
        this.setReader(reader);
        this.setCurrentPage(0);
        this.setOpen(false);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
    public Person getReader() {
        return reader;
    }
    public void setReader(Person reader) {
        this.reader = reader;
    }

    @Override
    public void open() {
        this.setOpen(true);
    }
    @Override
    public void close() {
        this.setOpen(false);
    }
    @Override
    public void leafThrough(int newCurrentPage) {
        if (this.isOpen() && newCurrentPage <= this.getTotalPage())
            this.setCurrentPage(newCurrentPage);
        else System.out.println("The book cannot be leafed through");
    }
    @Override
    public void nextPage() {
        if (this.isOpen()) this.setCurrentPage(getCurrentPage() + 1);
        else System.out.println("The book is not open");
    }
    @Override
    public void previousPage() {
        if (this.isOpen()) this.setCurrentPage(getCurrentPage() - 1);
        else System.out.println("The book is not open");
    }

    public void details() {
        System.out.println(
            "\nTitle: " + this.getTitle() + "\n" +
            "Author: " + this.getAuthor() + "\n" +
            "Current Page: " + this.getCurrentPage() + "\n" +
            "Open: " + this.isOpen() + "\n" +
            "Reader Name: " + this.getReader().getName() + "\n" +
            "Reader Gender: " + this.getReader().getGender() + "\n" +
            "Reader Age: " + this.getReader().getAge() + "\n"
        );
    }
}