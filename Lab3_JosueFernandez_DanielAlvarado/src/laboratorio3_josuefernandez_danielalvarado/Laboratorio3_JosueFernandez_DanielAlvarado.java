/*
 Laboratorio 3: Tower of God
 */
package laboratorio3_josuefernandez_danielalvarado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josue Fernandez
 * @author Daniel Alvarado
 */
public class Laboratorio3_JosueFernandez_DanielAlvarado {

    static Scanner sc = new Scanner(System.in);
    
    static boolean signedInAsAdministrator = false;
    
    static ArrayList<Piso> torre = new ArrayList();
    static ArrayList<Integer> pisosExistentes = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 1;
        
        while (opcion!=0) {
            imprimirMenu();
            opcion = sc.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1:
                    
                    System.out.print("Ingrese el usuario: ");
                    String usuario = sc.next();
                    
                    System.out.print("Ingrese la conraseña: ");
                    String contraseña = sc.next();
                    System.out.println();
                    
                    if (usuario.equals("SUDO") && contraseña.equals("clau123")) {
                        signedInAsAdministrator = true;
                        System.out.println("Ingreso exitoso.");
                    } else {
                        System.out.println("El usuario y/o la contraseña ´son incorrectos.");
                    }
                    
                    while(signedInAsAdministrator){
                        menuAdministrador();
                    }
                    
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Ha ingresado una opción inválida.");
                case 0:
            }
            
        }
        
        
        
    }
    
    public static void imprimirMenu(){
        System.out.println("\nTOWER OF GOD\n");
        System.out.println("1. Log-in as Administrator");
        System.out.println("2. Log-in as User");
        System.out.println("0. Salir");
        System.out.print("\n Ingrese la opción que desea: ");
    }

    public static void menuAdministrador(){
        
        System.out.println("\n*** ADMINISTRADOR ***");
        System.out.println("1.  Crear Persona");
        System.out.println("2.  Modificar Persona");
        System.out.println("3.  Elminar Persona");
        System.out.println("4.  Crear Prueba");
        System.out.println("5.  Modificar Prueba");
        System.out.println("6.  Eliminar Prueba");
        System.out.println("7.  Crear Piso");
        System.out.println("8.  Modificar Piso");
        System.out.println("9.  Eliminar Piso");
        System.out.println("10. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        
        String nombre;
        
        switch (opcion) {
            case 1:
                
                
                
                
                break;
            case 2:
                //Modificar persona
                break;
            case 3:
                //Eliminar persona
                break;
            case 4:
                //Crear prueba
                break;
            case 5:
                //modificar prueba
                break;
            case 6:
                //eliminar prueba
                break;
            case 7:
                //crear piso
                break;
            case 8:
                //modificar piso
                break;
            case 9:
                //eliminar piso
                break;
            case 10:
                signedInAsAdministrator = false;
                break;
            default:
        }
    }

    public static void crearPersona(){
        
        //Listar Pisos
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.print("Ingrese el piso en que desea agregar esta persona: ");
        int cualPiso = sc.nextInt();
        
        while(cualPiso<1 || cualPiso>134 || !pisosExistentes.contains(cualPiso)){
            System.out.print("\tEl piso ingresado no es válido, ingrese de nuevo: ");
        }   cualPiso = sc.nextInt();
        
        //Crear persona
        System.out.println("***CREAR PERSONA***\n");
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.next();
        
        System.out.println("Posiciones:");
        System.out.println("1-> Pescador");
        System.out.println("2-> Portador de lanzas");
        System.out.println("3-> Portador de luz");
        System.out.println("4-> Explorador");
        System.out.println("5-> Manipulador de ondas");
        System.out.print("\nIngrese la posición de la persona: ");
        int posi = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(posi<1 || posi>5){
            
            System.out.println("\tPosiciones:");
            System.out.println("\t1-> Pescador");
            System.out.println("\t2-> Portador de lanzas");
            System.out.println("\t3-> Portador de luz");
            System.out.println("\t4-> Explorador");
            System.out.println("\t5-> Manipulador de ondas");
            System.out.print("\n\tIngrese la posición de la persona: ");
            posi = sc.nextInt();
            System.out.println();
        }
        
        String posicion="";
        switch(posi){
            case 1:
                posicion = "Pescador";
                break;
            case 2:
                posicion = "Portador de lanzas";
                break;
            case 3:
                posicion = "Portador de luz";
                break;
            case 4:
                posicion = "Explorador";
                break;
            case 5:
                posicion = "Manipulador de ondas";
        }
        
        System.out.print("Ingrese la identificación de la persona: ");
        int id = sc.nextInt();
        
        for (int i=0; i<torre.size(); i++) {
            
            for (Persona h : torre.get(i).getHabitantes()) {
                //Conseguimos el id de cada persona de cada piso de la torre
                int identificacion = h.getIdentificacion();
                //Lo comparamos con el nuevo id
                if (identificacion==id) {
                    System.out.print("La identificación ingresada no stá disponible. Ingrese una diferente: ");
                    id = sc.nextInt();
                    i=-1;
                }
            }
        }
        
        System.out.println("\nTipos:");
        System.out.println("1-> Normal");
        System.out.println("2-> Ranker");
        System.out.print("Ingrese el tipo de persona que es: ");
        int tipo = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(tipo<1 || tipo>2){
            
            System.out.println("\tTipos:");
            System.out.println("\t1-> Normal");
            System.out.println("\t2-> Ranker");
            System.out.print("\n\tIngrese un tipo de persona válido: ");
            tipo = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("\nEstado de registro:");
        System.out.println("1-> Regular");
        System.out.println("2-> Irregular");
        System.out.print("\nIngrese el estado de registro de la persona: ");
        int registro = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(registro<1 || registro>2){
            
            System.out.println("\tEstado de registro:");
            System.out.println("\t1-> Regular");
            System.out.println("\t2-> Irregular");
            System.out.print("\n\tIngrese un estado de registro válido: ");
            tipo = sc.nextInt();
            System.out.println();
        }
        
        int pisoEnLista=0;
        for (int i = 0; i < torre.size(); i++) {
            if (cualPiso==torre.get(i).getNivel()) {
                pisoEnLista = i;
            }
        }
        
        //Creamos el estado de registro
        EstadoRegistro estado;
                
        //En caso de ser regular
        if (registro==1) {
            System.out.print("Cree un usuario: ");
            String usuario = sc.next();
            System.out.print("Cree una contraseña: ");
            String contraseña = sc.next();
            estado = new Regular(usuario, posicion);
        } else {
            estado = new Irregular();
        }
        
        //En caso de ser normal...
        if(tipo==1){
            System.out.print("Escriba el obetivo de la persona: ");
            String objetivo = sc.next();
                
            //Creamos la persona
            torre.get(pisoEnLista).getHabitantes().add(new Normal(objetivo, nombre, id, new Posicion(posicion), estado));
        } else {
            torre.get(pisoEnLista).getHabitantes().add(new Ranker(nombre, id, new Posicion(posicion), estado));
        }
        
    }//Fin de crearPersona
    
}
