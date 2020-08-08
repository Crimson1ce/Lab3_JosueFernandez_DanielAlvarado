/*
 Laboratorio 3: Tower of God
 */
package laboratorio3_josuefernandez_danielalvarado;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Josue Fernandez
 * @author Daniel Alvarado
 */
public class Laboratorio3_JosueFernandez_DanielAlvarado {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    static boolean signedInAsAdministrator = false;
    
    static ArrayList<Piso> torre = new ArrayList();
    static ArrayList<Integer> pisosExistentes = new ArrayList();
    static ArrayList<Persona> personasEnTorre = new ArrayList();
    static ArrayList<Prueba> pruebas = new ArrayList();
    
    static int contadorPersonas = 0;
    static int contadorRankers = 0;
    static int contadorNormales = 0;
    
    static int contadorPisos = 0;
    static int contadorPruebas = 0;
    
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
        System.out.println("1.  Crear Persona"); //Terminado
        System.out.println("2.  Modificar Persona");
        System.out.println("3.  Elminar Persona");
        System.out.println("4.  Crear Prueba"); //
        System.out.println("5.  Modificar Prueba");
        System.out.println("6.  Eliminar Prueba");
        System.out.println("7.  Crear Piso");
        System.out.println("8.  Modificar Piso");
        System.out.println("9.  Eliminar Piso");
        System.out.println("10. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        String nombre;
        /*
        contadorPisos++;
        torre.add(new Piso());
        pisosExistentes.add(1);
        */
        switch (opcion) {
            case 1:
                //Crear persona
                crearPersona();
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
                System.out.println("Opción inválida.");
        }
    }

    public static void crearPersona(){
        
        //Crear persona
        System.out.println("***CREAR PERSONA***\n");
        
        //Listar Pisos
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        /*
        System.out.print("Ingrese el piso en que desea agregar esta persona: ");
        int cualPiso = sc.nextInt();
        
        while(cualPiso<1 || cualPiso>134 || !pisosExistentes.contains(cualPiso)){
            System.out.print("\tEl piso ingresado no es válido, ingrese de nuevo: ");
            cualPiso = sc.nextInt();
        }   
        */
        
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.next();
        
        System.out.println("\nPosiciones:");
        System.out.println("1-> Pescador");
        System.out.println("2-> Portador de lanzas");
        System.out.println("3-> Portador de luz");
        System.out.println("4-> Explorador");
        System.out.println("5-> Manipulador de ondas");
        System.out.print("Ingrese la posición de la persona: ");
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
        
        System.out.print("Ingrese el número de identificación de la persona: ");
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
        System.out.print("Ingrese el estado de registro de la persona: ");
        int registro = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(registro<1 || registro>2){
            
            System.out.println("\tEstado de registro:");
            System.out.println("\t1-> Regular");
            System.out.println("\t2-> Irregular");
            System.out.print("\tIngrese un estado de registro válido: ");
            registro = sc.nextInt();
            System.out.println();
        }
        
        /*
        int pisoEnLista=0;
        for (int i = 0; i < torre.size(); i++) {
            if (cualPiso==torre.get(i).getNivel()) {
                pisoEnLista = i;
            }
        }
        */
        
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
            sc.nextLine();
            String objetivo = sc.nextLine();
                
            //Creamos la persona
            personasEnTorre.add(contadorNormales,new Normal(objetivo, nombre, id, new Posicion(posicion), estado));
            contadorNormales++;
        } else {
            personasEnTorre.add(new Ranker(nombre, id, new Posicion(posicion), estado));
            contadorRankers++;
        }
        
        contadorPersonas++;
        
    }//Fin de crearPersona
    
    public static void modificarPersona(){
        listarPersonas();
        System.out.println();
        
        System.out.print("Ingrese el número de la persona a modificar: ");
        int nPersona = sc.nextInt();
        
        System.out.println("");
        
        
    }
    
    public static void listarPersonas(){
        int i=1;
        System.out.println("PERSONAS\n");
        for (Piso piso : torre) {
            for (Persona habitante : piso.getHabitantes()) {
                System.out.println((i++) + ". " + habitante.toString());
            }
        }
    }
    
    public static void listarRankers(){
        
        int i=1;
        System.out.println("RANKERS\n");
        for (int j = contadorNormales; j < contadorPersonas; j++) {
            System.out.println((i++) + ". " + personasEnTorre.toString());
        }
    }
    
    public static void listarNormales(){
        
        int i=1;
        System.out.println("NORMALES\n");
        for (int j = 0; j < contadorNormales; j++) {
            System.out.println((i++) + ". " + personasEnTorre.toString());
        }
    }
    
    public static Persona getPersonaEnTorre(int posicion){
        
        int i=1;
        for (Piso piso : torre) {
            for (Persona habitante : piso.getHabitantes()) {
                if (i==posicion) {
                    return habitante;
                }
            }
        }
        
        return new Persona();
    }
    
    public static void crearPrueba(){
    
        System.out.print("Ingrese el nombre de la prueba: ");
        String nombre = sc.nextLine();
        
        listarRankers();
        System.out.print("Escoja al ranker evaluador de la prueba: ");
        int nRanker = sc.nextInt();
        sc.nextLine();
        
        while (nRanker<1 || nRanker>contadorRankers) {            
            listarRankers();
            System.out.print("Escoja un ranker válido: ");
            nRanker = sc.nextInt();
            sc.nextLine();
        }
        
        Prueba test = new Prueba(nombre, (Ranker) personasEnTorre.get(contadorNormales + nRanker-1));
        pruebas.add(test);
        
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarNormales();
                
            System.out.print("Ingrese el indice de la persona a agregar al equipo: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorNormales){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            pruebas.get(contadorPruebas).getParticipantes().add((Normal)personasEnTorre.get(index-1));
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        
        System.out.print("¿Fue la prueba aprobada?\n1.Sí\n2.No\nRespuesta: ");
        int respuesta = sc.nextInt();
        
        while (respuesta<1 || respuesta>2) {
            System.out.print("\t¿Fue la prueba aprobada?\n\t1.Sí\n\t2.No\n\tRespuesta: ");
            respuesta = sc.nextInt();
        }
        
        contadorPruebas++;
        
    }

    public static void crearPiso(){
        int contador=0;
        
        System.out.println("Crear Piso");
        System.out.println();
        
        System.out.print("Ingrese el nombre del administrador del piso: ");
        String administrador = sc.next();
        System.out.println();
        
        
        System.out.print("Ingrese el nivel del piso: ");
        int nivel = sc.nextInt();
        
        while(nivel < 0 || nivel > 134 || pisosExistentes.contains(nivel)){
            System.out.print("El nivel ingresado es inválido! Ingrese de nuevo: ");
            nivel = sc.nextInt();
        }
        
        torre.add(new Piso(administrador));
        contadorPisos++;
        
        boolean evaluadores = true;
        
        while(evaluadores){
            
            listarRankers();
            
            System.out.print("Ingrese el indice de la persona: ");
            int indice = sc.nextInt();
                
            while(indice < 1 || indice > contadorRankers){
                System.out.print("El indice ingresado es incorrecto! Ingrese de nuevo: ");
                indice = sc.nextInt();
            }
                
            Ranker n =(Ranker)personasEnTorre.get(contadorNormales + indice - 1);
            torre.get(contadorPisos).getEvaluadores().add(n);
            
            System.out.print("Desea seguir agregando evaluadores 1= si Otro número= no: ");
            int c = sc.nextInt();
                
            if(c != 1){
                evaluadores = false;
            }
        }
            
        boolean hayDirector = false;
            
        while(hayDirector == false){
            int limit = personasEnTorre.size()-1;
            int ale = 0+r.nextInt(limit);
                
            if(personasEnTorre.get(ale) instanceof Ranker){
                torre.get(contadorPisos).setDirector((Ranker)personasEnTorre.get(ale));
                hayDirector = true;
            }
            
        }
            
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarPersonas();
                
            System.out.print("Ingrese el indice de la persona a agregar al piso: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorPersonas){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            torre.get(contadorPisos).getHabitantes().add(personasEnTorre.get(index-1));
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        System.out.println("El piso se ha agregado exitosamente a la torre!");
        System.out.println();
            
        contadorPisos++;
        
    }
    
}

