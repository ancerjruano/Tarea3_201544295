package tarea_3;

import java.util.Scanner;


/**
 *
 * @author ancer
 */
public class Tarea_3 {

        private String Nombres[] = new String[5];
    public static void main(String[] args) {
        Tarea_3 tarea3=new Tarea_3();
                tarea3.MenuPrincipal();
    }

     public void MenuPrincipal(){
          // Encabezado Menu Principal
        System.out.println("......................");
        System.out.println(" Tarea 3 ");
        System.out.println(" 201544295 ");
        System.out.println("......................");
        
        // Opciones Menu Principal
        System.out.println(" 1) Usuarios");
        System.out.println(" 2) Palabras Palindromas");
        System.out.println(" 3) Salir");  
        OpcionMenu1();
     }
      public void MenuUsuarios(){
          // Encabezado Menu Principal
        System.out.println("......................");
        System.out.println(" Menú Usuarios");
        System.out.println("......................");
        
        // Opciones Menu Principal
        System.out.println(" 1) Ingresar Usuarios");
        System.out.println(" 2) Mostrar todos los usuarios");
        System.out.println(" 3) Mostrar uruario Personalizado");  
        System.out.println(" 4) Menú Principal");
        System.out.println(" 5) Salir");
        OpcionMenu2();
     }
      public void OpcionMenu1(){
         int opcion;
          // Ingreso de Opción
        Scanner option = new Scanner(System.in);
        System.out.print(" *Ingresa Una Opción ");
        opcion = option.nextInt();
        
        // Switch opcion
        switch (opcion){
            case 1: 
                 MenuUsuarios();
                  break;
            case 2: 
                  break;
            case 3: 
                System.out.println("Has Salido");
                System.exit(0);
                  break;
                  
        }
    }
         public void OpcionMenu2(){
         int opcion1;
          // Ingreso de Opción
        Scanner option = new Scanner(System.in);
        System.out.print(" *Ingresa Una Opción ");
        opcion1 = option.nextInt();
        
        // Switch opcion
        switch (opcion1){
            case 1: 
                 Ingresar();
                  break;
            case 2: 
                 Mostrar();
                  break;
            case 3:
                 MostrarUsuarioPersonalizado();
                  break;
            case 4:
                break;
            case 5: 
                System.out.println("Has Salido");
                System.exit(0);
                  break;
       
        }
      }
        
       public void Ingresar(){
    
        // Declarar Arreglo
        //String Palabras[] = new String[5];
        String nombre;
        // Lector de Palabra
        Scanner ingreso = new Scanner(System.in);
            // Ingreso de Palabras 
            for (int i=0; i<getNombres().length; i++ ){
                System.out.println("Ingresa Usuario --->  ");
                nombre = ingreso.next();
                // Almacena Palabras
                getNombres()[i]=nombre;
            }
          MenuUsuarios();
        }
       public void Mostrar(){
        
        // Mostrar Palabras en Pantalla
        for (int i=0; i<getNombres().length; i++){
            System.out.println("Nombre "+i+": "+getNombres()[i]);
        }
        MenuUsuarios();
    }
      public void MostrarUsuarioPersonalizado(){
          String nombre;
          int n;
          Scanner UsuarioP = new Scanner(System.in);
                  System.out.println("Ingrese Usuario");
                  nombre=UsuarioP.next();
                  for(n=0;n<Nombres.length;n++){
        if(nombre == Nombres[n]){
           System.out.println("Usuario");
           System.out.println(n);
        }else{
         System.out.println("Usuario");
         System.out.println("ERROR!! No existe ningún usuario con esa coincidencia");
         } 
       }
      }
      /**
     * @return the Nombres
     */
    public String[] getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Palabras to set
     */
    public void setNombres(String[] Nombres) {
        this.Nombres = Nombres;
    }
}

     
    

