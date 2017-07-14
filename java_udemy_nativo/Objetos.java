public class Objetos{
  String nombre;
  String color;

    public static void main(String[] args){
      Objetos objeto1 = new Objetos();
      Objetos objeto2 = new Objetos();

      objeto1.nombre = "objeto1";
      objeto2.nombre = "objeto2";
      objeto1.color = "azul";
      objeto2.color = "rojo";

      System.out.println("El nombre del objeto1 es: " + objeto1.nombre);
      System.out.println("El color del objeto1 es: " + objeto1.color);
      System.out.println("El color del objeto1 es: " + objeto2.color);
      System.out.println("El nombre del objeto1 es: " + objeto2.nombre);
    }
}
