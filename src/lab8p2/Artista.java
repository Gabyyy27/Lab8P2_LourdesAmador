/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2;

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
    private ArrayList<Cancion> listaCanciones;
    
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
    
    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }
    
    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }
}


