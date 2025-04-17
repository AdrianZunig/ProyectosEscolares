package practica1;
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
        int residuo, año_nacimiento,divisor = 12;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("======Zodiaco Chino======\n"
                + "Introduce el año en el que naciste: ");
                   año_nacimiento = entrada.nextInt();
                
                residuo = año_nacimiento % divisor; //% Residuo de una division
                
        if(residuo == 0){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Mono en el horoscopo chino");
        }else if(residuo == 1){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Gallo en el horoscopo chino");
        }else if(residuo == 2){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Perro en el horoscopo chino");
        }else if(residuo == 3){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Cerdo en el horoscopo chino");
        }else if(residuo == 4){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Rata en el horoscopo chino");
        }else if(residuo == 5){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Buey en el horoscopo chino");
        }else if(residuo == 6){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Tigre en el horoscopo chino");
        }else if(residuo == 7){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Conejo en el horoscopo chino");
        }else if(residuo == 8){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Dragón en el horoscopo chino");
        }else if(residuo == 9){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Serpiente en el horoscopo chino");
        }else if(residuo == 10){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Caballo en el horoscopo chino");
        }else if(residuo == 11){
            System.out.println("Haz nacido en el año "+año_nacimiento+",te corresponde el signo Cabra en el horoscopo chino");
        }
        
    }//Main
    
}//Class
