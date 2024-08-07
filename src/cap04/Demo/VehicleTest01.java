package cap04.Demo;

import cap04.Class.Vehicle.Vehicle;

public class VehicleTest01 {
  public static void main(String[] args) {

    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();

    int faixa;
    int faixa2;

    minivan.numPassageiros = 7;
    minivan.capacCombustivelGaloes = 16;
    minivan.consumoCombustivel = 21;

    sportscar.numPassageiros = 2;
    sportscar.capacCombustivelGaloes = 14;
    sportscar.consumoCombustivel = 12;

    faixa = minivan.capacCombustivelGaloes * minivan.consumoCombustivel;
    faixa2 = sportscar.capacCombustivelGaloes * sportscar.consumoCombustivel;

    System.out
        .println("o carro minivan tem o numero de passageiros " + minivan.numPassageiros + " na faixa de " + faixa);
    
    System.out
        .println("o carro sportscar tem o numero de passageiros " + sportscar.numPassageiros + " na faixa de " + faixa2);
    
  }
}
