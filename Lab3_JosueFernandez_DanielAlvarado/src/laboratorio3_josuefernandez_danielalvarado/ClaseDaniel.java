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
    /*
<<<<<<< HEAD
    
=======

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Piso> torre = new ArrayList();
    static int contador = 0;
    static ArrayList<Persona> personas = new ArrayList();

    public static void crearPiso() {
        System.out.println("Crear Piso");
        System.out.println();

        System.out.println("Ingrese el nombre del administrador del piso: ");
        String administrador = sc.next();
        System.out.println();

        System.out.println("Ingrese el nivel del piso");
        int nivel = sc.nextInt();

        while (nivel < 0 || nivel > 134) {
            System.out.println("El nivel ingresado es incorrecto!");
            nivel = sc.nextInt();
        }

        torre.add(new Piso(administrador));
        int num = 0;

        boolean evaluadores = true;

        while (evaluadores) {

            System.out.println("Lista de Rankers");
            for (Persona r : personas) {

                if (r instanceof Ranker) {
                    System.out.println(torre.get(num).getHabitantes().indexOf(r) + ". " + r);
                }

                System.out.println("Ingrese el indice de la persona: ");
                int indice = sc.nextInt();

                while (indice < 0 || indice > torre.get(num).getHabitantes().size() - 1) {
                    System.out.println("El indice ingresado es incorrecto!");
                    indice = sc.nextInt();
                }

                Ranker n = (Ranker) personas.get(indice);
                torre.get(contador).getEvaluadores().add(n);

                System.out.println("Desea seguir agregando evaluadores 1= si 2 no: ");
                int c = sc.nextInt();

                if (c == 2) {
                    evaluadores = false;
                }
                num++;
            }

            boolean hayDirector = false;

            while (hayDirector == false) {
                int limit = personas.size() - 1;
                int ale = 0 + r.nextInt(limit);

                if (personas.get(ale) instanceof Ranker) {
                    torre.get(contador).setDirector((Ranker) personas.get(ale));
                    hayDirector = true;
                }

            }

            boolean agregarPersonas = true;

            while (agregarPersonas) {
                System.out.println("Lista de personas");
                for (Persona p : personas) {
                    System.out.println(personas.indexOf(p) + ". " + p);
                }

                System.out.println("Ingrese el indice de la persona a agregar al piso");
                int index = sc.nextInt();

                while (index < 0 || index > personas.size() - 1) {
                    System.out.println("El indice es incorrecto!");
                    index = sc.nextInt();
                }

                torre.get(contador).getHabitantes().add(personas.get(index));

                System.out.println("Desea seguir agregando personas 1 = si 2 = no");
                int decision = sc.nextInt();

                if (decision == 2) {
                    agregarPersonas = false;
                }

                System.out.println("El piso se ha agregado exitosamente a la torre");
                System.out.println();
            }

        }

    }

    public static void modificarPiso() {
        System.out.println("Modificar piso");
        System.out.println();

        System.out.println("Lista de pisos");
        for (Piso p : torre) {
            System.out.println(torre.indexOf(p) + ". " + p);
        }
        System.out.println();

        System.out.println("Elija el indice del piso a modificar: ");
        int indice = sc.nextInt();

        while (indice > torre.size() || indice < 0) {
            System.out.println("El indice ingresado es incorrecto!");
            indice = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Elija el atributo a modificar: ");
        System.out.println("1) Modificar administrador");
        System.out.println("2) Modificar evaluadores");
        System.out.println("3) Asignar un nuevo director");
        System.out.println("4) Asignar nuevo nivel");
        System.out.println("5) Modificar lista de habitantes");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Modificar administrador");
                System.out.println();

                System.out.println("Ingrese el nombre del nuevo administrador: ");
                String nombre = sc.next();
                System.out.println();

                torre.get(indice).setAdministrador(nombre);

                System.out.println("Se cambio el administrador correctamente");
                System.out.println();

                break;

            case 2:
                System.out.println("Modificar evaluadores");
                System.out.println();

                System.out.println("-> Ingrese la opcion a ejecutar: ");
                System.out.println("1) Agregar evaluadores");
                System.out.println("2) Eliminar evaluadores");
                int index = sc.nextInt();

                switch (index) {

                    case 1:
                        // desplegar lista de rankers

                        System.out.println("Elija el indice del ranker a agregar");
                        int s = sc.nextInt();
                        //agregar validacion while de indice lista de rankers

                        //ranker r = personas.get(indice);
                        //torre.get(indice).getEvaluadores().add(r);
                        System.out.println("Se agrego un nuevo evaluador a la lista");
                        System.out.println();
                        break;

                    case 2:
                        for (Persona p : torre.get(indice).getEvaluadores()) {
                            System.out.println(torre.get(indice).getEvaluadores().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice del evaluador a eliminar");
                        int num = sc.nextInt();

                        while (num > torre.get(indice).getEvaluadores().size() - 1 || num < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            num = sc.nextInt();
                        }

                        torre.get(indice).getEvaluadores().remove(num);

                        System.out.println("El evaluador ha sido eliminado de la lista");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Se equivoco de opcion...");
                        System.out.println();
                }
                break;

            case 3:
                System.out.println("Asignar un nuevo director");
                System.out.println();

                boolean hayDirector = false;

                while (hayDirector == false) {
                    int limit = personas.size() - 1;
                    int ale = 0 + r.nextInt(limit);

                    if (personas.get(ale) instanceof Ranker) {
                        torre.get(contador).setDirector((Ranker) personas.get(ale));
                        hayDirector = true;
                    }
                }
                System.out.println("Un nuevo director se agrego aleatoreamente");
                System.out.println();

                break;

            case 4:
                System.out.println("Modificar el nivel del piso");
                System.out.println();

                System.out.println("Ingese el nuevo nivel del piso");
                int nivel = sc.nextInt();

                boolean incorrecto = true;

                while (incorrecto) {
                    boolean ciclo;
                    ciclo = validarPiso(nivel);

                    if (ciclo) {
                        incorrecto = false;
                    }
                }

                torre.get(indice).setNivel(nivel);

                System.out.println("El nivel del piso se modifico correctamente");
                System.out.println();
                break;

            case 5:
                System.out.println("Modificar habitantes");
                System.out.println();

                System.out.println("-> Ingrese su eleccion: ");
                System.out.println("1) Agregar personas");
                System.out.println("2) Eliminar una persona");
                int eleccion = sc.nextInt();

                switch (eleccion) {

                    case 1:
                        System.out.println("Agregar persona");
                        System.out.println();

                        for (Persona p : personas) {
                            System.out.println(personas.indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice de la persona a agregar: ");
                        int e = sc.nextInt();

                        while (e > personas.size() - 1 || e < 0) {
                            System.out.println("El indice es incorrecto!");
                            e = sc.nextInt();
                        }

                        torre.get(indice).getHabitantes().add(personas.get(e));

                        System.out.println("Se agrego un nuevo habitante a la lista");
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Eliminar persona");
                        System.out.println();

                        for (Persona p : torre.get(indice).getHabitantes()) {
                            System.out.println(torre.get(indice).getHabitantes().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice de la persona a eliminar: ");
                        int n = sc.nextInt();

                        while (n > torre.get(indice).getHabitantes().size() - 1 || n < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            n = sc.nextInt();
                        }

                        torre.get(n).getHabitantes().remove(n);

                        System.out.println("El habitante se ha eliminado del piso");
                        System.out.println();

                        break;
                }
                break;

            case 6:
                System.out.println("Ha decidido salir");
                break;

            default:
                System.out.println("La opcion es incorrecta!");
                System.out.println();
        }
    }

    public static boolean validarPiso(int nivel) {

        boolean correcto = false;
        int c = 0;

        for (int i = 0; i < torre.size(); i++) {
            int numero = torre.get(i).getNivel();

            if (nivel == numero) {
                c++;
            }
        }

        if (c == 0) {
            correcto = true;
        }

        return correcto;
    }
    
    public static void eliminarPiso(){
        System.out.println("Elimninar un piso");
        System.out.println();
        
        System.out.println("-> Esta es la lista de pisos");
        for (Piso p : torre) {
            System.out.println(torre.indexOf(p)+". "+p);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del piso a eliminar: ");
        int indice = sc.nextInt();
        
        while(indice > torre.size()-1 || indice < 0){
            System.out.println("El indice ingresado es incorrecto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        Piso eliminar = torre.get(indice);
        
        System.out.println("Desea eliminar esta piso \n"+eliminar);
        System.out.println("1 = si, 2 = no");
        int decision = sc.nextInt();
        
        if(decision == 1){
            torre.remove(indice);
            
            System.out.println("El piso se ha eliminado exitosamente");
            System.out.println();
        }else{
            System.out.println("El piso no se elimino");
            System.out.println();
        }
    }

>>>>>>> 5d9b42f8b893ed75063d43805dbdeae5d64b5b9d
*/
}
