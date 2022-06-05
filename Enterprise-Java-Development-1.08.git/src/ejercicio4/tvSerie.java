package ejercicio4;

public class tvSerie extends Video{
    private int capitulos;
    private int temporada;

    public tvSerie(double duration, String author, String format, int width, int height, String resolution, String name, int capitulos, int temporada) {
        super(duration, author, format, width, height, resolution, name);
        this.capitulos = capitulos;
        this.temporada = temporada;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public int getTemporada() {
        return temporada;
    }
}
