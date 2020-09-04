package lab6_tylercruz;

public class Cancion {
    private String nombre;
    private String puntuacion;
    private String ano;
    private String artista;
    private String album;

    public Cancion() {
    }

    public Cancion(String nombre, String puntuacion, String ano, String artista, String album) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.ano = ano;
        this.artista = artista;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", ano=" + ano + ", artista=" + artista + ", album=" + album + '}';
    }
    
    
    
    
}
