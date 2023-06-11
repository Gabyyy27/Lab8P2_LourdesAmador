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
import java.io.*;
import java.util.*;

public class Bitacora implements Serializable {
    private List<RegistroActividad> registros;

    public Bitacora() {
        registros = new ArrayList<>();
    }

    public void registrarActividad(String accion, String persona) {
        Date tiempo = new Date();
        RegistroActividad registro = new RegistroActividad(accion, tiempo, persona);
        registros.add(registro);
        guardarBitacora();
    }

    public void mostrarBitacora() {
        for (RegistroActividad registro : registros) {
            System.out.println(registro);
        }
    }

    private void guardarBitacora() {
        try {
            FileOutputStream fileOut = new FileOutputStream("bitacora.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Bitacora cargarBitacora() {
        Bitacora bitacora = null;
        try {
            FileInputStream fileIn = new FileInputStream("bitacora.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            bitacora = (Bitacora) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bitacora;
    }

    private static class RegistroActividad implements Serializable {
        private String accion;
        private Date tiempo;
        private String persona;

        public RegistroActividad(String accion, Date tiempo, String persona) {
            this.accion = accion;
            this.tiempo = tiempo;
            this.persona = persona;
        }

        @Override
        public String toString() {
            return "Acción: " + accion + ", Tiempo: " + tiempo + ", Persona: " + persona;
        }
    }
}
