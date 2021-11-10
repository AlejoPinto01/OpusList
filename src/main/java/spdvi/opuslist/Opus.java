package spdvi.opuslist;

/**
 *
 * @author Alejo
 */
public class Opus {
    private String registre;
    private String titol;
    private int any;
    private String format;
    private String autor;
    private String imatge;

    public Opus() {
    }

    public Opus(String registre, String titol, int any, String format, String autor, String imagePath) {
        this.registre = registre;
        this.titol = titol;
        this.any = any;
        this.format = format;
        this.autor = autor;
        this.imatge = imagePath;
    }

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagePath() {
        return imatge;
    }

    public void setImagePath(String imagePath) {
        this.imatge = imagePath;
    }

    @Override
    public String toString() {
        return registre + ", " + titol + ", " + any + ", " + format + ", " + autor + ", " + imatge;
    }
    
}
