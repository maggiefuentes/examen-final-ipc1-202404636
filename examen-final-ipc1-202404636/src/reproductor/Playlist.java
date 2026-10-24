/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

/**
 *
 * @author maggi
 */
public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    public void setCola(NodoDoble cola) {
        this.cola = cola;
    }

    public NodoDoble getActual() {
        return actual;
    }

    public void setActual(NodoDoble actual) {
        this.actual = actual;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void agregarCancion(Cancion c) {
        if (c == null) {
            return;
        }
        NodoDoble nuevo = new NodoDoble(c);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.SetAnterior(cola);
            cola = nuevo;
        }
        tamanio++;
    }

    public void mostrarPlaylist() {
        NodoDoble aux = cabeza;
        while (aux != null) {
            Cancion c = aux.getDato();
            System.out.println(c.getTitulo() + " - " + c.getArtista());
            aux = aux.getSiguiente();
        }
    }

    public Cancion siguiente() {
        if (actual == null || actual.getSiguiente() == null) {
            return null;
        }
        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public Cancion anterior() {
        if (actual == null || actual.getAnterior() == null) {
            return null;
        }
        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public void eliminarActual() {
        if (actual == null) {
            return;
        }
        NodoDoble eliminado = actual;
        NodoDoble prev = eliminado.getAnterior();
        NodoDoble next = eliminado.getSiguiente();
        if (prev == null && next == null) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (prev == null) {
            cabeza = next;
            cabeza.SetAnterior(null);
            actual = cabeza;
        } else if (next == null) {
            cola = prev;
            cola.setSiguiente(null);
            actual = cola;
        } else {
            prev.setSiguiente(next);
            next.SetAnterior(prev);
            actual = next;
        }

        eliminado.SetAnterior(null);
        eliminado.setSiguiente(null);
        eliminado.setDato(null);

        tamanio--;
        if (tamanio < 0) {
            tamanio = 0;
        }
    }
}
