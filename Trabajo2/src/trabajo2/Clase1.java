package trabajo2;

import java.util.Scanner;

// MetCostructor
public class Clase1 {
    public Clase1(int opcion,double n) {
        
        // MENU
        if(opcion == 1){
            met1(n);
        }else if(opcion == 2){
            met2(n);
        }else if(opcion == 3){
            met3(n);
        }else if(opcion == 4){
            met4(n);
        }else if(opcion == 5){
            met5(n);
        }else if(opcion == 6){
            met6(n);
        }else if(opcion == 7){
            met7(n);
        }else if(opcion == 8){
            met8(n);
        }else if(opcion == 9){
            System.out.println("===== Eligio ingresar otro numero =====");
            new Trabajo2();
        }else if(opcion == 0){
            System.out.println("Saliendo del programa...");
            System.exit(0); // Termina la ejecución del programa
        }
        
    } // fin de constructor
    
    // METODOS 
    public void met1(double n){
            System.out.println("Eligio seno, coseno  y arcotangente");
            double anguloRadianes = Math.toRadians(n);            
// Calcular seno, coseno y arco tangente
            double seno = Math.sin(anguloRadianes);
            double coseno = Math.cos(anguloRadianes);
            double arcoTangenteRadi = Math.atan(n);
            //Convertir a grados
            double arcotangenteGrados = Math.toDegrees(arcoTangenteRadi);

            // Mostrar los resultados
            System.out.println("Seno: " + seno);
            System.out.println("Coseno: " + coseno);
            System.out.println("Arco Tangente: " +arcotangenteGrados );
    }// fin de metodo
    
    public void met2(double n){
            System.out.println("Eligio logaritmo natural");

            // Verificar que el número sea positivo para ln(x)
            if (n > 0) {
                
            n = Math.log(n);
            System.out.println("Logaritmo natural (ln): " + n);
            } else {
            System.out.println("Error: El logaritmo natural solo está definido para números positivos.");}
            // Calcular función exponencial e^x
            double exponencial = Math.exp(n);
            System.out.println("Función exponencial (e^x): " + exponencial);
    }// fin de metodo
    
    public void met3(double n){
            System.out.println("Eligio truncar y redondear");
            System.out.println("Truncar: " + Math.floor(n));
            System.out.println("Redondear: " + Math.round(n));
    }// fin de metodo
    
    public void met4(double n){
            System.out.println("Eligio raiz cuadrada");
            System.out.println("Raíz cuadrada: " + Math.sqrt(n));
    }// fin de metodo
    
    public void met5(double n){
            System.out.println("Eligio valor absoluto");
            System.out.println("Valor absoluto: " + Math.abs(n));
    }// fin de metodo
    
    public void met6(double n){
            System.out.println("Eligio separar parte entera y decimal");
            int parteEntera = (int) n;
            double parteDecimal = n - parteEntera;
            System.out.println("Parte entera: " + parteEntera);
            System.out.println("Parte decimal: " + parteDecimal);
    }// fin de metodo
    
    public void met7(double n){
            System.out.println("Eligio hallar factorial");
            // Calcular el factorial usando un bucle for
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // Mostrar el resultado
            System.out.println("El factorial de " + n + " es: " + factorial);
    }// fin de metodo
    
    public void met8(double n){
            System.out.println("Eligio averigua si es primo ");
            boolean esPrimo = true; // Variable para almacenar si es primo o no

            // Un número menor o igual a 1 no es primo
            if (n <= 1) {
                esPrimo = false;
            } else {
            // Verificamos si el número tiene algún divisor aparte de 1 y él mismo
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // Si es divisible, no es primo
                    esPrimo = false;
                    break; // Salimos del bucle, ya sabemos que no es primo
                    }
               }
            }
            // Mostramos el resultado
            if (esPrimo) {
                System.out.println(n + " es un número primo.");
            } else {
                System.out.println(n + " no es un número primo.");
            }
    }// fin de metodo
    
}// Class
