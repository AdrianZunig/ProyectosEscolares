//Creacion de Metodo
package operaciones;
import java.util.Scanner;
//Las clases cuentan con: Atributos y Metodos
public class Funcion {
  //Atrivutos
    int v1,v2;
    int s,r,m,opcion;
    float d;
    Scanner sc = new Scanner(System.in);
    
    public void calculadora(){//Metodo
    System.out.println("=====Eliga la operacion=====\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicacion\n"
                + "4 division\n"
                + "----------------------------");
    
    opcion = sc.nextInt();
    
    if(opcion == 1){
        System.out.println("====SUMA====");
        System.out.print("Ingrese el primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        v2 = sc.nextInt();
        s= v1+v2;
        System.out.println("La suma es: "+s);
    }else if(opcion == 2){
        System.out.println("====RESTA====");
        System.out.print("Ingrese el primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        v2 = sc.nextInt();
        r= v1-v2;
        System.out.println("La resta es: "+r);
    }else if(opcion == 3){
        System.out.println("====MULTIPLICACION====");
        System.out.print("Ingrese el primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        v2 = sc.nextInt();
        m= v1*v2;
        System.out.println("La multiplicacion es: "+m);
    }else if(opcion == 4){
        System.out.println("====DIVISION====");
        System.out.print("Ingrese el primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        v2 = sc.nextInt();
        d= v1/v2;
        System.out.println("La division es: "+d);
    }

    }//Metodo
    
}//Class
