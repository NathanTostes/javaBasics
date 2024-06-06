public interface Publication {
    public void open();
    public void close();
    public void leafThrough(int newCurrentPage);
    public void nextPage();
    public void previousPage();
}