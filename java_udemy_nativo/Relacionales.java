public class Relacionales{
  public static void main(String args[]){
    int     i   = -3;
    byte    b   = 5;
    short   s   = 16;
    double  d   = 3.14;

    boolean b1  = i > i;
    boolean b2  = i < b;
    boolean b3  = b <= s;
    boolean b4  = s >= d;
    boolean b5  = d != 0;
    boolean b6  = 1 == s;

    System.out.println("El valor de b1 es : " + b1);
    System.out.println("El valor de b2 es : " + b2);
    System.out.println("El valor de b3 es : " + b3);
    System.out.println("El valor de b4 es : " + b4);
    System.out.println("El valor de b5 es : " + b5);
    System.out.println("El valor de b6 es : " + b6);
  }
}
