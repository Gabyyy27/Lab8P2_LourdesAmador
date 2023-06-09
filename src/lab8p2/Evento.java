/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2;

import java.util.Date;

/**
 *
 * @author Lourdes
 */
import java.util.Date;

public class Evento {
    private Date fecha;
    private String ciudad;
    private String lugar;
    private int capacidadPersonas;

    public Evento(Date fecha, String ciudad, String lugar, int capacidadPersonas) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidadPersonas = capacidadPersonas;
    }

    public Date getFecha() {
        return fecha;
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
}
