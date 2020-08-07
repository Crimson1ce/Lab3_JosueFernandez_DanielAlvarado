/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;
import java.util.ArrayList;

public class Piso {
    
    private String administrador;
    private ArrayList <Ranker> evaluadores = new ArrayList();
    private Ranker director;
    private ArrayList<Persona> habitantes = new ArrayList();
    private int nivel;

    public Piso() {
    }

    public Piso(String administrador) {
        this.administrador = administrador;
    }

    public Piso(String administrador, Ranker director, int nivel) {
        this.administrador = administrador;
        this.director = director;
        this.nivel = nivel;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Ranker> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<Ranker> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public Ranker getDirector() {
        return director;
    }

    public void setDirector(Ranker director) {
        this.director = director;
    }

    public ArrayList<Persona> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Persona> habitantes) {
        this.habitantes = habitantes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Piso: " + "administrador = " + administrador + ", evaluadores=" +
                evaluadores + ", director = " + director 
                + ", habitantes = " + habitantes + ", nivel = " + nivel;
    }
    
    
}
