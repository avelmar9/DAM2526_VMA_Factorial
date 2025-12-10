
import java.util.Scanner;

public class Factorial {
	private static Scanner sc = new Scanner(System.in);

	private static int pedirNumero() {
	    int num;
	    boolean valido;

	    do {
	        System.out.print("Introduce un número entero mayor o igual que 0: ");
	        if (sc.hasNextInt()) {
	            num = sc.nextInt();
	            valido = true;
	        } else {
	            System.out.println("Entrada no válida. Introduce un entero.");
	            sc.next();
	            valido = false;
	            num = -1;
	        }
	    } while (!valido);

	    return num;
	}
	
	private static long factorialBucle(int n) {

	    long fac = 1;
	    for (int i = 1; i <= n; i++) {
	        fac *= i;
	    }
	    return fac;
	}
 

	private static long factorialRec(int n) {
	    if (n == 0 || n == 1) {
	      return 1;
	    }

	    return n * factorialRec(n - 1);
	}

	
	public static void main(String[] args) {
        sc = new Scanner(System.in);
     int num= pedirNumero();
     
        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }

        sc.close();


        System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialBucle(num));

        
        System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialRec(num));
        
        
	}

}