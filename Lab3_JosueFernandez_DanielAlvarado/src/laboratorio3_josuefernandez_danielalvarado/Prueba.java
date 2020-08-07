/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;

import java.util.ArrayList;

/**
 *
 * @author dalva
 */
public class Prueba {
    private String nombre;
    private Ranker evaluador;
    private ArrayList<Normal> participantes = new ArrayList();
    private boolean aprovada;

    public Prueba() {
    }

    public Prueba(String nombre, Ranker evaluador) {
        this.nombre = nombre;
        this.evaluador = evaluador;
    }

    public Prueba(String nombre, Ranker evaluador, boolean aprovada) {
        this.nombre = nombre;
        this.evaluador = evaluador;
        this.aprovada = aprovada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ranker getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Ranker evaluador) {
        this.evaluador = evaluador;
    }

    public ArrayList<Normal> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Normal> participantes) {
        this.participantes = participantes;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public String toString() {
        return "Prueba: " + "nombre = " + nombre + "  evaluador = " + evaluador + ", participantes = " + participantes + ", aprovada = " + aprovada;
    }
}
