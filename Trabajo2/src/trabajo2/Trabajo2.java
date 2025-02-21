package trabajo2;
import java.util.Scanner;
public class Trabajo2 {
    
    public static void main(String[] args) {
        Trabajo2 ob = new Trabajo2(); // llamar MetConstructor
        
    }//MAIN
    
    public Trabajo2(){ // Constructors
        
        Scanner entrada = new Scanner(System.in);
        int eleccion; double n;
        System.out.println("Ingrses un numero: ");
        n = entrada.nextDouble();
        
        System.out.println("=====Seleccione una opcion=====");
         System.out.println("1) seno, coseno  y arcotangente\n"
                 + "2) logaritmo natural\n"
                 + "3) truncar, redondear\n"
                 + "4) raiz cuadrada\n"
                 + "5) valor absoluto\n"
                 + "6) separar parte entera y decimal\n"
                 + "7) hallar factorial\n"
                 + "8) averigua si es primo\n"
                 + "9) ingresa otro numero\n"
                 + "0) salir\n"
                 + "===========================================");          
        eleccion = entrada.nextInt();
                        
        Operaciones op = new Operaciones(n,eleccion); // llamar Constructor
        entrada.close(); // Cerramos el Scanner al final
        } // cierre metodo
    
}// CALASS
