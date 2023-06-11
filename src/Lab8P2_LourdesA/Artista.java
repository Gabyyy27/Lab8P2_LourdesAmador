/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8P2_LourdesA;

import java.util.ArrayList;

/**
 *
 * @author Lourdes
 */
public abstract class Artista {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String generoMusical;
    private ArrayList<Canciones> listaCanciones;
    
    public Artista(String usuario, String contraseña, String nombre, String generoMusical) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.listaCanciones = new ArrayList<>();
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
    
    public String getGeneroMusical() {
        return generoMusical;
    }
    
    public ArrayList<Canciones> getListaCanciones() {
        return listaCanciones;
    }
    
    public void agregarCancion(Canciones cancion) {
        listaCanciones.add(cancion);
    }
}


