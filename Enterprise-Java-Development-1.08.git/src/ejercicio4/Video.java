package ejercicio4;

public abstract class Video {
    private double duration;
    private String author;
    private String format;
    private int width;
    private int height;
    private String resolution;

    private String name;
    private String genre;

    public Video(double duration, String author, String format, int width, int height, String resolution, String name, String genre) {
        this.duration = duration;
        this.author = author;
        this.format = format;
        this.width = width;
        this.height = height;
        this.resolution = resolution;
        this.name = name;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Video(double duration, String author, String format, int width, int height, String resolution, String name) {
        this.duration = duration;
        this.author = author;
        this.format = format;
        this.width = width;
        this.height = height;
        this.resolution = resolution;
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getResolution() {
        return resolution;
    }
}
