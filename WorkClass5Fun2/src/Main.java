import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Car"));
        vehicles.add(new Plane("Plane ",5));
        vehicles.add(new Canoe("Canoe",4));

        for (var vehicle : vehicles ){
            vehicle.move();
        }
    }


}
