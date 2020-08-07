/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;
import java.util.ArrayList;

public class Ranker extends Persona{
    
    private ArrayList <Prueba> evaluador = new ArrayList();

    public Ranker() {
        super();
    }

    public Ranker(String nombre, int identificacion, Posicion posicion, EstadoRegistro estado) {
        super(nombre, identificacion, posicion, estado);
    }

   

    public void setEvaluador(ArrayList<Prueba> evaluador) {
        this.evaluador = evaluador;
    }

    @Override
    public String toString() {
        return "\tRanker\n" + super.toString();
    }
    
    
}
