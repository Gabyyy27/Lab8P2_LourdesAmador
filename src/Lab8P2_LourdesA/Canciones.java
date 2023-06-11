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
public class Canciones {
    private String nombre;
    private int duracionSegundos;

    public Canciones(String nombre, int duracionSegundos) {
        this.nombre = nombre;
        this.duracionSegundos = duracionSegundos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }
}

