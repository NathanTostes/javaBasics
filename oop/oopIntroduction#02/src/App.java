public class App {
    public static void main(String[] args) throws Exception {
        Shirt shirt1 = new Shirt();
        shirt1.color = "gray";
        shirt1.material = "cotton";
        shirt1.size = 40;
        shirt1.dress = true;
        
        Shirt shirt2 = new Shirt();
        shirt2.color = "pink";
        shirt2.material = "poliester";
        shirt2.size = 24;
        shirt2.dress = false;

        shirt1.takeOffShirt();
        shirt2.toDress();
        shirt1.status();
        shirt2.status();

        Book book1 = new Book();
        book1.name = "Dom Casmurro";
        book1.author = "Machado de Assis";
        book1.totalPages = 130;
        book1.bookmarkedPage = 80;

        book1.status();
        book1.mark(42);
        book1.status();

        Workout legDay = new Workout();
        legDay.muscleGroups = new String[]{"Quadríceps", "Hamstring", "Calf"};
        legDay.gym = "Black Gym";
        legDay.minutesDuration = 80;
        legDay.progressPercentage = 98;

        legDay.status();


    }
}
