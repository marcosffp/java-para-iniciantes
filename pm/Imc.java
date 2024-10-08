

public class Imc {
  private double peso;
  private double altura;

  public Imc() {
  }
  
  public Imc(double peso, double altura) {
    this.peso = peso;
    this.altura=altura;
  }

  public void setPeso(double peso) {
    if (peso <= 0) {
      System.out.println("Peso invalido");
    } else {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return peso;
  }

  public void setAltura(double altura) {
    if (altura <= 0) {
      System.out.println("Altura invalido");
    } else {
      this.altura = altura;
    }
  }

  public double getAltura() {
    return altura;
  }

  public double getImc() {
    return peso / (altura * altura);
  }
}
