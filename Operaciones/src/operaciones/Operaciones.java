package operaciones;//Implementacion de metodos de una clase
import java.util.Scanner;
public class Operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;
      do{ //Lee las instrucciones
        //Menu inicial
          System.out.println("====Que desea realizar====\n"
                  + "1 Operaciones basicas\n"
                  + "2 Area de fijuras Geometricas\n"
                  + "---------------------------------");
          int eleccion;
          eleccion = entrada.nextInt(); //ingresar desde consola
          
        if(eleccion == 1){
            Funcion a = new Funcion(); //Creamos objeto de la clase
            a.calculadora(); 
        }else if(eleccion == 2){
            FigurasArea b = new FigurasArea(); //Creamos objeto de la clase
            b.Area(); //Llamar metodo de la clase
        }
      //Preguntar al usuario si desea realizar otra acción
            System.out.println("------------------------------------");
            System.out.print("¿Desea realizar otra operación? (si/no): ");
            entrada.nextLine(); // Limpiar el buffer
            opcion = entrada.nextLine();
      }while (opcion.equalsIgnoreCase("si")); //Analiza la condicion

    }//MAIN 
}//CLASS
