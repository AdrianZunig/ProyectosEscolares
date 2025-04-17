package funcintegradas1;

import java.util.Scanner;

public class Class1 {
    Scanner entrada = new Scanner(System.in); 
    int opcion;
    
    public void menu(){ // METODO
        
        System.out.println("===== Marque una opcion =====\n"
                + "1) Convertir el número entero a una cadena en binario\n"
                + "2) Convierte la cadena a mayúsculas y \n   Obtiene la longitud de la cadena.\n"
                + "0) Salir del programa");
        
        opcion = entrada.nextInt();
        if (opcion == 1){
            met1(); // invocar metodo
            
        }else if(opcion == 2){
            met2(); // invocar metodo
        }else if(opcion == 0){
            System.out.println("Saliendo del programa...");
            System.exit(0); // Termina la ejecución del programa
        }
                  
    } // FinMetodo
    
    public void met1(){
        
        // Definir un número entero
        int numero;
        System.out.print("\n===== NUMERO A BINARIO =====\n"
                + "Digite un valor entero: ");
        numero = entrada.nextInt();

        // Convertir el número entero a una cadena en binario
        String binario = Integer.toBinaryString(numero);
        System.out.println("El número " + numero + " en binario es: " + binario);

        // Convertir la cadena binaria de nuevo a un número entero
        int numeroConvertido = Integer.parseInt(binario, 2);
        System.out.println("El binario " + binario + " convertido a entero es: " + numeroConvertido);
        
    }// Fin Met1
    
    public void met2() { //METODO
        
        // Define una cadena de texto
        String texto;
        System.out.print("\nDigite la cadena: ");
        entrada.nextLine(); // Limpiar scanner para almacenar cadena
        texto = entrada.nextLine(); // Almacenar cadena

        // Convierte la cadena a mayúsculas
        String mayusculas = texto.toUpperCase(); 
        System.out.println("Texto en mayúsculas: " + mayusculas);

        // Obtiene la longitud de la cadena
        int longitud = texto.length();
        System.out.println("Longitud del texto: " + longitud);

    } //FinMet2
    
}// class
