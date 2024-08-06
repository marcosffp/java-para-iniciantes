public class ImcTest {
  public static void main(String[] args) {
    Imc imc = new Imc();
    imc.setPeso(80);
    imc.setAltura(1.60);
    double valorImc = imc.getImc();
    System.out.println(valorImc);
  }
}
