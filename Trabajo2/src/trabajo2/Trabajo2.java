package trabajo2;
import java.util.Scanner;
public class Trabajo2 {
    
    public static void main(String[] args) {        
        
        //Instanciar constructor
        new Trabajo2();
        
    }//MAIN
    
    // Metodo constructor
    public Trabajo2() {
        //Variables y scanner
        Scanner entrada = new Scanner(System.in);
        int opcion; double n;
        
        System.out.print("Ingrse un numero a utilizar: ");
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
        opcion = entrada.nextInt();
        
        // instanciar/crear objeto
        Clase1 ob = new Clase1(opcion,n); 
    }
}// CALASS
