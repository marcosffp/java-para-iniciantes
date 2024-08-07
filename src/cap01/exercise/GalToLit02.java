package cap01.exercise;

public class GalToLit02 {
  public static void main(String[] args) {

    double galoes, litros;
    int cont = 0;
    for (galoes = 1; galoes <= 1000; galoes++) {
      litros = galoes * 3.7854;
      System.out.println(galoes + " galoes é " + litros + " litros");
      cont++;
      if (cont == 10) {
        System.out.println();
        cont = 0;
      }
    }
  }
}
