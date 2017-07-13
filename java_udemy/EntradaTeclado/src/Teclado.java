import java.util.Scanner;
public class Teclado {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad :  ");
        int edad = scanner.nextInt();
        System.out.println("La edad que nos proporcionaste es : " + edad);
        System.out.println("Gracias por darnos su información");
    }
}
