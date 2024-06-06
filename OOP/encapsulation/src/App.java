public class App {
    public static void main(String[] args) {
        RemoteControler remote1 = new RemoteControler();
        remote1.powerOn();
        for (int i = 0; i <= 30; i++) {
            remote1.decreaseVolume();
        }
        remote1.play();
        // remote1.powerOff();
        remote1.openMenu();
        remote1.closeMenu();
    }
}