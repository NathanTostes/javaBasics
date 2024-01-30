public class View {
    private Grasshoper viewer;
    private Video video;
    private boolean rated = false;

    public View(Grasshoper viewer, Video video) {
        setViewer(viewer);
        setVideo(video);
        viewer.sawMore();
        viewer.gainExperience(1);
        video.setViews(video.getViews()+1);
        video.play();
    }

    public Grasshoper getViewer() {
        return viewer;
    }
    public void setViewer(Grasshoper viewer) {
        this.viewer = viewer;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }

    public void avaliate() {
        if (!this.rated) {
            this.rated = true;
            this.video.setRate(2.5f);
        }
    }
    public void avaliate(int rate) {
        if (!this.rated) {
            this.rated = true;
            this.video.setRate((float) rate / 2);
        }
    }
    public void avaliate(float percentageRate) {
        if (!this.rated) {
            this.rated = true;
            this.video.setRate((float) percentageRate / 20);
        }
    }

    @Override
    public String toString() {
        return "Viewer: " + viewer + "\nVideo: " + video + "]";
    }
}
