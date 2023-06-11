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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bitacora {
    private List<String> acciones;

    public Bitacora() {
        acciones = new ArrayList<>();
    }

    public void agregarAccion(String accion) {
        // Obtener la hora actual del sistema
        Date horaActual = new Date();
        // Formatear la hora en un formato legible
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formatoHora.format(horaActual);

        // Construir el registro de acción
        String registroAccion = horaFormateada + " - Usuario1: " + accion;

        // Agregar el registro a la lista de acciones
        acciones.add(registroAccion);
    }

    public void guardarBitacora() {
        try {
            FileWriter fileWriter = new FileWriter("bitacora.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir las acciones en el archivo
            for (String accion : acciones) {
                printWriter.println(accion);
            }

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error al guardar la bitácora");
            e.printStackTrace();
        }
    }
}
