package cap04.Demo;
import cap04.Class.Vehicle.Vehicle;

public class VehicleTest04 {
  public static void main(String[] args) {

    Vehicle minivan = new Vehicle(7,16,21);
    Vehicle sportscar = new Vehicle(2,14,12);

    double galoes01;
    double galoes02;
    int dist;
    dist = 252;
    

    galoes01 = minivan.combustivelNecessario(dist);
    galoes02 = sportscar.combustivelNecessario(dist);

    System.out
        .println("Para percorrer " + dist + " milhas, a minivan precisa de " + galoes01 + " galões de combustível");
    System.out
        .println("Para percorrer " + dist + " milhas, o esportivo precisa de " + galoes02 + " galões de combustível");
        
  }
}
