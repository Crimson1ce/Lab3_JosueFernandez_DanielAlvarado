/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;

public class Persona {
    
    private String nombre;
    private int identificacion;
    private Posicion posicion;
    private EstadoRegistro estado;

    public Persona() {
    }

    public Persona(String nombre, int identificacion, Posicion posicion, EstadoRegistro estado) {
        this.nombre = nombre;
        setIdentificacion(identificacion);
        this.posicion = posicion;
        this.estado = estado;
    }
    
    

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        if(identificacion > 0){
            this.identificacion = identificacion;
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public EstadoRegistro getEstado() {
        return estado;
    }

    public void setEstado(EstadoRegistro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tIdentificación: " + identificacion + "\tPosición: " + posicion.toString() + "\tEstado: " + estado.toString();
    }
    
    
    
    
}
