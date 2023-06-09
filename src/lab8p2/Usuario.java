/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2;


/**
 *
 * @author Lourdes
 */
import java.util.ArrayList;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private int edad;
    private ArrayList<Evento> listaEventos;
    private ArrayList<Artista> listaArtistasSeguidos;

    public Usuario(String usuario, String contraseña, String nombre, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.edad = edad;
        this.listaEventos = new ArrayList<>();
        this.listaArtistasSeguidos = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public ArrayList<Artista> getListaArtistasSeguidos() {
        return listaArtistasSeguidos;
    }

    public void seguirArtista(Artista artista) {
        listaArtistasSeguidos.add(artista);
    }
}

