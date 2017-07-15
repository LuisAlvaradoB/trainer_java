import java.util.Scanner;
public class Operaciones {
  int numero1;
  int numero2;
  int sumar;
  int restar;
  int multiplicar;
  int dividir;

  /*
    Este método va a realizar la lectura de los números
  */

  public void leerNumeros() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el primer numero : ");
    numero1 = sc.nextInt();
    System.out.println("Escribe el segundo numero : ");
    numero2 = sc.nextInt();
  }


  /*
  Este método va a realizar la suma de los numeros
  */

  public void sumar() {
    sumar = numero1 + numero2;
  }

  /*
  Este método va a realizar la resta de los numeros
  */

  public void restar() {
    restar = numero1 - numero2;
  }

  /*
  Este método va a realizar la multiplicación de los numeros
  */

  public void multiplicar() {
    multiplicar = numero1 * numero2;
  }

  /*
  Este método va a realizar la división de los numeros
  */

  public void dividir () {
    dividir = numero1 / numero2;
  }

  /*
  Este método va a realizar la impresión de los resultados de las operaciones
  */

  public void imprimirResultados() {
    System.out.println("El resultado de la suma es : " + sumar);
    System.out.println("El resultado de la resta es : " + restar);
    System.out.println("El resultado de la multiplicacion es : " + multiplicar);
    System.out.println("El resultado de la division es : " + dividir);
  }

  public static void main(String[] args) {
    Operaciones op = new Operaciones();
    op.leerNumeros();
    op.sumar();
    op.restar();
    op.multiplicar();
    op.dividir();
    op.imprimirResultados();
  }

}
