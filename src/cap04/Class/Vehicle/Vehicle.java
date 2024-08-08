package cap04.Class.Vehicle;

public class Vehicle {
  public int numPassageiros; // passengers
  public int capacCombustivelGaloes; // fuelcap
  public int consumoCombustivel; //mpg

  public int milasPorGalao;

  public Vehicle(int numPassageiros, int capacCombustivelGaloes, int consumoCombustivel) {
    this.numPassageiros = numPassageiros;
    this.capacCombustivelGaloes = capacCombustivelGaloes;
    this.consumoCombustivel = consumoCombustivel;
  }

  public int range() {
    return capacCombustivelGaloes * consumoCombustivel;
  }

  public double combustivelNecessario(int milasPorGalao) {
    return (double) milasPorGalao / consumoCombustivel;
  }

  protected void finalize() {
    
  }
}
