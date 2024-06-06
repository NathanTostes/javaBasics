public class Grasshoper extends Person {
    private String login;
    private int totalView;

    public Grasshoper(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totalView = 0;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalView() {
        return totalView;
    }
    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrasshoper [login=" + login + ", totalView=" + totalView + "]";
    }
    public void sawMore() {
        totalView++;
    }
}
