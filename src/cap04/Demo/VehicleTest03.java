package cap04.Demo;
import cap04.Class.Vehicle.Vehicle;

public class VehicleTest03 {
  public static void main(String[] args) {

    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();


    minivan.numPassageiros = 7;
    minivan.capacCombustivelGaloes = 16;
    minivan.consumoCombustivel = 21;

    sportscar.numPassageiros = 2;
    sportscar.capacCombustivelGaloes = 14;
    sportscar.consumoCombustivel = 12;

    System.out
        .println("Carro minivan pode transportar " + minivan.numPassageiros + " com alcance de " + minivan.range() + " milhas");
    System.out
        .println("Carro sportivo pode transportar " + sportscar.numPassageiros + " com alcance de " + sportscar.range() + " milhas");
  }
}
