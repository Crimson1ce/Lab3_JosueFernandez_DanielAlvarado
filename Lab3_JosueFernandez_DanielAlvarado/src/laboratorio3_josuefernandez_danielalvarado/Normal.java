/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;
import java.util.ArrayList;

public class Normal extends Persona {
    
    private ArrayList <Prueba> pruebas = new ArrayList();
    private String objetivo;

    public Normal() {
        super();
    }

    public Normal(String objetivo, String nombre, int identificacion, Posicion posicion, EstadoRegistro estado) {
        super(nombre, identificacion, posicion, estado);
        this.objetivo = objetivo;
    }

    

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Normal:\n" + super.toString() + "\tObjetivo: " + objetivo;
    }
    
    
}
