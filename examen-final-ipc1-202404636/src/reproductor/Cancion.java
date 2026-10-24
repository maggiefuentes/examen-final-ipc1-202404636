/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

/**
 *
 * @author maggi
 */
public class Cancion extends Multimedia {

    private String artista;

    public Cancion(String titulo, int duracion, String artist) {
        super(titulo, duracion);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + artista + " (" + getDuracion() + "s)");
    }
}
