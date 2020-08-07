/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;


public class Posicion {
    
    private String posicion;

    public Posicion() {
    }

    public Posicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Posicion: " + "posicion = " + posicion;
    }
    
    
}
