/*
 Laboratorio 3: Tower of God
 */
package laboratorio3_josuefernandez_danielalvarado;

import java.util.Scanner;

/**
 *
 * @author Josue Fernandez
 * @author Daniel Alvarado
 */
public class Laboratorio3_JosueFernandez_DanielAlvarado {

    static Scanner sc = new Scanner(System.in);
    
    static boolean signedInAsAdministrator = false;
    
    //static ArrayList<Piso> = new ArrayList();
    
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
        
        while(posi<1 || posi>5){
            
            System.out.println("\tPosiciones:");
            System.out.println("\t1-> Pescador");
            System.out.println("\t2-> Portador de lanzas");
            System.out.println("\t3-> Portador de luz");
            System.out.println("\t4-> Explorador");
            System.out.println("\t5-> Manipulador de ondas");
            System.out.print("\n\tIngrese la posición de la persona: ");
            posi = sc.nextInt();
            
        }
        
    }
    
}
