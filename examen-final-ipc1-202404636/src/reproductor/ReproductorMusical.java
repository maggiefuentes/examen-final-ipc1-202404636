/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

/**
 *
 * @author maggi
 */
public class ReproductorMusical {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Cancion 1", 305, "Artista A");
        Cancion c2 = new Cancion("Cancion 2", 250, "Artista B");
        Cancion c3 = new Cancion("Cancion 3", 195, "Artista C");

        c1.reproducir();

        c2.reproducir();

        c3.reproducir();
    }
}
