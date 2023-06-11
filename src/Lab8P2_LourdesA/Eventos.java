/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8P2_LourdesA;

/**
 *
 * @author Lourdes
 */
import java.util.ArrayList;
import java.util.List;

public class Eventos {
    private String nombre;
    private String ciudad;
    private String lugar;
    private int capacidadPersonas;
    private List<Canciones> setlist;
    private String artista;

    public Eventos(String nombre, String ciudad, String lugar, int capacidadPersonas, String artista) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidadPersonas = capacidadPersonas;
        this.setlist = new ArrayList<>();
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public String getArtista() {
        return artista;
    }

    public void setSetlist(List<Canciones> setlist) {
        this.setlist = setlist;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void addCancion(Canciones cancion) {
        setlist.add(cancion);
    }

    public List<Canciones> getSetlist() {
        return setlist;
    }

    @Override
    public String toString() {
        return nombre;
    }
}


