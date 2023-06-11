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
public class Solista extends Artista {
    private int edad;
    
    public Solista(String usuario, String contraseña, String nombre, String generoMusical, int edad) {
        super(usuario, contraseña, nombre, generoMusical);
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
}


