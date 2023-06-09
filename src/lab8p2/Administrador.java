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

public class Administrador {
    private String usuario;
    private String contraseña;
    private ArrayList<String> bitacora;
    
    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.bitacora = new ArrayList<>();
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public ArrayList<String> getBitacora() {
        return bitacora;
    }
    
    public void agregarRegistroBitacora(String registro) {
        bitacora.add(registro);
    }
    
    public void eliminarRegistroBitacora(int indice) {
        if (indice >= 0 && indice < bitacora.size()) {
            bitacora.remove(indice);
        }
    }
}
