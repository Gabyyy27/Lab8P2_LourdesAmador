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
public class Banda extends Artista {
    private int numeroIntegrantes;
    
    public Banda(String usuario, String contraseña, String nombre, String generoMusical, int numeroIntegrantes) {
        super(usuario, contraseña, nombre, generoMusical);
        this.numeroIntegrantes = numeroIntegrantes;
    }
    
    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }
}

