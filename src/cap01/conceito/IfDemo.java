package cap01.conceito;

public class IfDemo {
  public static void main(String[] args) {
    int a, b, c;

    a = 3;
    b = 2;

    if (a > b) {
      System.err.println("a maior q b");
    }

    if (a == b) {
      System.out.println("os valores são diferentes");
    }

    c = b - a;

    if (c >= 0) {
      System.out.println("c não é negativo");
    }

    if (c<0) {
      System.out.println("c é negativo");
    }
  }
}
