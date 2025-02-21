package trabajo2;

public class Operaciones {
    public Operaciones(double n,int eleccion){ // Constructor
        if(eleccion == 1){
            System.out.println("Eligio seno, coseno  y arcotangente");
            
        // Calcular seno, coseno y arco tangente
        double seno = Math.sin(n);
        double coseno = Math.cos(n);
        double arcoTangente = Math.atan(n);

        // Mostrar los resultados
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Arco Tangente: " + arcoTangente);
            
        }else if(eleccion == 2){
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

            
        }else if(eleccion == 3){
            System.out.println("Eligio truncar y redondear");
            System.out.println("Truncar: " + Math.floor(n));
            System.out.println("Redondear: " + Math.round(n));
            
        }else if(eleccion == 4){
            System.out.println("Eligio raiz cuadrada");
            System.out.println("Raíz cuadrada: " + Math.sqrt(n));
            
            
        }else if(eleccion == 5){
            System.out.println("Eligio valor absoluto");
            System.out.println("Valor absoluto: " + Math.abs(n));
            
            
        }else if(eleccion == 6){
            System.out.println("Eligio separar parte entera y decimal");
            int parteEntera = (int) n;
            double parteDecimal = n - parteEntera;
            System.out.println("Parte entera: " + parteEntera);
            System.out.println("Parte decimal: " + parteDecimal);
            
                    
        }else if(eleccion == 7){
            System.out.println("Eligio hallar factorial");
            // Calcular el factorial usando un bucle for
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // Mostrar el resultado
            System.out.println("El factorial de " + n + " es: " + factorial);
            
    
        }else if(eleccion == 8){
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
            
        }else if(eleccion == 9){
            System.out.println("Eligio ingresar otro numero: ");
            Trabajo2 ob = new Trabajo2();
            
        }else if(eleccion == 0){
            System.out.println("Saliendo del programa...");
            System.exit(0); // Termina la ejecución del programa
        }
    } // Fin Constructor
} //Class
