public class Main {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = a + b;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    a = a + 3;
    b = b - 2;
    c = a * b;

    System.out.println("Apres modifications :");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    int resultat = c / a;
    System.out.println("resultat = " + resultat);
  }
}
