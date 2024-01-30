public class App {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        View[] view = new View[2]; 
        Grasshoper grasshoper1 = new Grasshoper("Nathan", 16, "M", "N4thanPro");

        videos[0] = new Video("Curso em Vídeo - Java POO #15");
        videos[1] = new Video("Luan Gameplays - Compilado");
        videos[2] = new Video("Games Edu - Danonão Grosso");

        view[0] = new View(grasshoper1, videos[0]);
        view[0].avaliate(100f);
        
        videos[0].like();
        view[1] = new View(grasshoper1, videos[2]);
        view[1].avaliate();

        System.out.println(view[0].toString());
        System.out.println(view[1].toString());
    }
}