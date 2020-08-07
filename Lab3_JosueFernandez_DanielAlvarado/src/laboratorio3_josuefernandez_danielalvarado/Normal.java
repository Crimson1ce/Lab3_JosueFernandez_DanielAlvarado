/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;
import java.util.ArrayList;

public class Normal extends Persona {
    
    private ArrayList <Prueba> pruebas = new ArrayList();
    private String descripcion;

    public Normal() {
    }

    public Normal(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Normal: " + "pruebas = " + pruebas + ", descripcion = " + descripcion;
    }
    
    
}
