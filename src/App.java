import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        int xn, a, b, mod, iteracion;


        System.out.println("Ingrese el valor de la semilla: ");
        xn = leer.nextInt();

        System.out.println("Ingrese el valor de la constante multiplicativa: ");
        a = leer.nextInt();

        System.out.println("Ingresa el valor de la constante aditiva: ");
        b = leer.nextInt();
        
        System.out.println("Ingrese el valor del módulo: ");
        mod = leer.nextInt();

        System.out.println("¿Cuántos números pseudoaleatorios desea generar?: ");
        iteracion = leer.nextInt();

        System.out.println("\nSecuencia:\n ");
        for (int i = 0; i < iteracion; i++) {

            System.out.print(xn + " ");
            xn = (a*xn + b) % mod;       
        }
              
    }

    /*X0 = semilla
     * a = constante multiplicativa
     * c = constante aditiva
     * m = módulo
     * 
     * Todos mayores que 0
     */


}
