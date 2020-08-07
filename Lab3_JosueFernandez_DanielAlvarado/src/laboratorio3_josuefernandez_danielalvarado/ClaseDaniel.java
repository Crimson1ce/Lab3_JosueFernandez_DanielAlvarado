/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_josuefernandez_danielalvarado;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author dalva
 */
public class ClaseDaniel {
    
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Piso> torre = new ArrayList();
    static int contador = 0;
    static ArrayList<Persona> personas = new ArrayList();
    
    public static void crearPiso(){
        System.out.println("Crear Piso");
        System.out.println();
        
        System.out.println("Ingrese el nombre del administrador del piso: ");
        String administrador = sc.next();
        System.out.println();
        
        
        System.out.println("Ingrese el nivel del piso");
        int nivel = sc.nextInt();
        
        while(nivel < 0 || nivel > 134){
            System.out.println("El nivel ingresado es incorrecto!");
            nivel = sc.nextInt();
        }
        
        torre.add(new Piso(administrador));
        int num = 0;
        
        boolean evaluadores = true;
        
        while(evaluadores){
            
            System.out.println("Lista de Rankers");
            for (Persona r : personas) {
                
                if(r instanceof Ranker){
                    System.out.println(torre.get(num).getHabitantes().indexOf(r)+". "+r);
                }
                
                System.out.println("Ingrese el indice de la persona: ");
                int indice = sc.nextInt();
                
                while(indice < 0 || indice > torre.get(num).getHabitantes().size()-1){
                    System.out.println("El indice ingresado es incorrecto!");
                    indice = sc.nextInt();
                }
                
                Ranker n =(Ranker)personas.get(indice);
                torre.get(contador).getEvaluadores().add(n);
                
                System.out.println("Desea seguir agregando evaluadores 1= si 2 no: ");
                int c = sc.nextInt();
                
                if(c == 2){
                    evaluadores = false;
                }
                num++;
            }
            
            boolean hayDirector = false;
            
            while(hayDirector == false){
                int limit = personas.size()-1;
                int ale = 0+r.nextInt(limit);
                
                if(personas.get(ale) instanceof Ranker){
                    torre.get(contador).setDirector((Ranker)personas.get(ale));
                    hayDirector = true;
                }
            
            }
            
            boolean agregarPersonas = true;
            
            while (agregarPersonas){
                System.out.println("Lista de personas");
                for (Persona p : personas) {
                    System.out.println(personas.indexOf(p)+". "+p);
                }
                
                System.out.println("Ingrese el indice de la persona a agregar al piso");
                int index = sc.nextInt();
                
                while(index < 0 || index > personas.size()-1){
                    System.out.println("El indice es incorrecto!");
                    index = sc.nextInt();
                }
                
                torre.get(contador).getHabitantes().add(personas.get(index));
                
                System.out.println("Desea seguir agregando personas 1 = si 2 = no");
                int decision = sc.nextInt();
                
                if(decision == 2){
                    agregarPersonas = false;
                }
                
                
                System.out.println("El piso se ha agregado exitosamente a la torre");
                System.out.println();
            }
            
            
            
            
        }
        
    }
   
    
}
