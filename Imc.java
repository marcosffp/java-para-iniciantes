public class Imc {
  private double peso;
  private double altura;

  public Imc() {}

  public void setPeso(double peso) {
    if (peso <= 0) {
      System.out.println("Peso invalido");
    } else {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return this.peso;
  }

  public void setAltura(double altura) {
    if (altura <= 0) {
      System.out.println("Altura invalido");
    } else {
      this.altura = altura;
    }
  }

  public double getAltura() {
    return this.altura;
  }

  public double getImc() {
    double imc = peso / (altura * altura);
    return imc;
  }
}
