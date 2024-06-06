public class Video implements VideoActions {
    private String title;
    private float rate;
    private float totalRate = 0;
    private int views;
    private int likes;
    private boolean playing;

    public Video(String title) {
        this.title = title;
        this.setViews(0);
        this.setLikes(0);
        this.setRate(0);
        this.setPlaying(false);
    }
 
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        if (rate <= 5 && rate >= 0) {
            totalRate += rate;
            this.rate = totalRate / views;
        }
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isPlaying() {
        return playing;
    }
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void play() {
        if (!playing) playing = true;
    }
    @Override
    public void pause() {
        if (playing) playing = false;
    }
    @Override
    public void like() {
        likes++;
    }
    @Override
    public String toString() {
        return "Video [title=" + title + ", rate=" + rate + ", views=" + views + ", likes=" + likes + ", playing="
                + playing + "]";
    }
}
