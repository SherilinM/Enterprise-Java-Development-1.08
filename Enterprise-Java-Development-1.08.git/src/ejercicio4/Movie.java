package ejercicio4;

public class Movie extends Video{

    private String reparto;

    public Movie(double duration, String author, String format, int width, int height, String resolution, String name, String genre, String reparto) {
        super(duration, author, format, width, height, resolution, name, genre);
        this.reparto = reparto;
    }

    public String getReparto() {
        return reparto;
    }
}
