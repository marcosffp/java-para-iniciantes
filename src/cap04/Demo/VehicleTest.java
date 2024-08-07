package cap04.Demo;

import cap04.Class.Vehicle.Vehicle;

public class VehicleTest {
  public static void main(String[] args) {

    Vehicle minivan = new Vehicle();
    int faixa;

    minivan.numPassageiros = 7;
    minivan.capacCombustivelGaloes = 16;
    minivan.consumoCombustivel = 21;

    faixa = minivan.capacCombustivelGaloes * minivan.consumoCombustivel;
    System.out.println(
        "o carro minivan tem o numero de passageiros "
            + minivan.numPassageiros
            + " na faixa de "
            + faixa);
  }
}
