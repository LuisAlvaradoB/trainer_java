import java.util.Scanner;
public class Teclado{
  public static void main(String[] args) {
    int i;
        int j;
        int suma;
        int resta;
        int mult;
        int div;
        int modulo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("********** Ingreso de Datos **********");
        System.out.println("--------------------------------------");
        System.out.println("Ingresa el primer numero");
        i = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        j = scanner.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("\n");

        suma = i + j;
        resta = i - j;
        mult = i * j;
        div = i / j;
        modulo = i % j;

        System.out.println("--------------------------------------");
        System.out.println("********** Calculo de Datos **********");
        System.out.println("--------------------------------------");
        System.out.println("El resultado de la suma es : " + suma);
        System.out.println("El resultado de la resta es : " + resta);
        System.out.println("El resultado de la multiplicacion es : " + mult);
        System.out.println("El resultado de la division es : " + div);
        System.out.println("El resultado de el modulo es : " + modulo);
        System.out.println("--------------------------------------");
        System.out.println("********** Fin de la operacion **********");
        System.out.println("--------------------------------------");
  }

}
