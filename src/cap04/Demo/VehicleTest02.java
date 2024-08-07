package cap04.Demo;
import cap04.Class.Vehicle.Vehicle;

public class VehicleTest02 {
  public static void main(String[] args) {

    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();

    minivan.numPassageiros = 7;
    minivan.capacCombustivelGaloes = 16;
    minivan.consumoCombustivel = 21;

    sportscar.numPassageiros = 2;
    sportscar.capacCombustivelGaloes = 14;
    sportscar.consumoCombustivel = 12;

    
    System.out.print("O carro minivan " + minivan.numPassageiros + ". ");
    minivan.range();
    System.out.print("O carro sportscar " + sportscar.numPassageiros + ". ");
    sportscar.range();
    
  }
}
