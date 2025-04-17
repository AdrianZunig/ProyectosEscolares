package operaciones;

import java.util.Scanner;

public class FigurasArea {
    public void Area(){ //Metodo
        System.out.println("=====Escoja la figura=====\n"
                + "1 Triangulo\n"
                + "2 Cuadrado\n"
                + "3 Rectangulo\n"
                + "4 Circulo\n"
                + "-----------------------------------");
                int opcion;
                Scanner sn = new Scanner(System.in); //Crear Scaner, pedir datos por consola
                opcion = sn.nextInt();
        
        if(opcion == 1){
            System.out.println("=======Triangulo=======");
          //Atrivutos/Variables
            double b,h,formula; 
          //Entrada de Datos
            System.out.print("Ingrese la Base: ");
            b = sn.nextFloat();
            System.out.print("Ingresa la Haltura: ");
            h = sn.nextDouble();
          //Operacion
            formula = (b*h)/2;
            System.out.println("El Area del Triangulo es: "+formula);
        }else if(opcion == 2){
            System.out.println("=====Cuadrado=====");
            double l,exp = 2,formula;
            System.out.print("Digite el lado: ");
            l = sn.nextDouble();
          //Operacion
            formula = Math.pow(l, exp); //Clase Math. Metodo Pow, eleva un numero
            System.out.println("El Area del Cuadrado es: "+formula);
        }else if(opcion == 3){
            System.out.println("=====Rectangulo=====");
            double b,h,formula;
            System.out.print("Ingrese la base: ");
            b = sn.nextDouble();
            System.out.print("Ingrese la altura: ");
            h = sn.nextDouble();
            formula = b*h;
            System.out.println("El Area del Rectangulo es: "+formula);
        }else if(opcion == 4){
            System.out.println("=====Circulo=====");
            double pi = 3.1416,r,exp = 2,formula;
            System.out.println("Ingrese el radio: ");
            r = sn.nextDouble();
            formula = (Math.pow(r,exp))*pi;
            System.out.println("El Area del circulo es: "+formula);
        }
    }//Metodo
    
}//Class
