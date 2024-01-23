public class App {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Person("Nathan", 16, "Male");
        persons[0].birthday();
        persons[1] = new Person("Deyvin", 30, "Male");

        Book[] books = new Book[2];
        books[0] = new Book("Dom Casmurro", "Machado de Assis", 157, persons[0]);
        books[1] = new Book("O Alquimista", "Paulo Coelho", 121, persons[1]);

        books[0].open();
        books[0].leafThrough(29);
        books[0].previousPage();
        books[0].details();
        books[1].nextPage();
        books[1].details();
    }
}
