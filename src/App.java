import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        int xn;
        double a = 1 + (4*(3));
        double b = 17; 
        double mod = Math.pow(2, 32); //siendo 17 primo relativo a este número
        int iteracion;


        System.out.println("Ingrese el valor de la semilla: ");
        xn = leer.nextInt();
        
        System.out.println("¿Cuántos números pseudoaleatorios desea generar?: ");
        iteracion = leer.nextInt();

        System.out.println("\nSecuencia:\n ");
        for (int i = 0; i < iteracion; i++) {

            System.out.print(xn + "  ");
            xn = (int) ((a*xn + b) % mod);       
        }

        //Realizar método para comprobar que c es primo relativo de m
              
    }

    /*X0 = semilla
     * a = constante multiplicativa
     * c = constante aditiva
     * m = módulo
     * 
     * Todos mayores que 0
     */


}
