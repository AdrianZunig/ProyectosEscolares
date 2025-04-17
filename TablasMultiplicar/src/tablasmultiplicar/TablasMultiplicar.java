/*for(inicializacion; condicion; aumento o decremento){
        instrucciones; }
*/
package tablasmultiplicar;
import java.util.Scanner;
public class TablasMultiplicar {

    public static void main(String[] args) {
        int n,multiplicar;
        String eleccion;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("Eliga la tabla de multiplicar a consultar: ");
            n = entrada.nextInt();
            System.out.println("\n======La tabla es======");
            
            for (int i = 1; i <= 10; i++) {
                multiplicar = n*i;
                System.out.println(n + "x" + i + " = " +multiplicar);
            }
            System.out.println("--------------------------------------");
        // Preguntar al usuario si desea realizar otra acción
            System.out.print("Desea consultar otra tabla (si/no): ");
            entrada.nextLine(); //Limpiar buffer
            eleccion = entrada.nextLine();
        }while(eleccion.equalsIgnoreCase("si"));
        
    }//Main
    
}//Class
