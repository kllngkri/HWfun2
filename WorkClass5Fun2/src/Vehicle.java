public class Vehicle {
    private String type;
    int fuel = 0;

    public Vehicle(String name){
        this.type = name;
    }

    public Vehicle(String name, int fuel){
        this.type = name;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public int getFuel() {
        return fuel;
    }

    public void move(){
        //how to move
    }
}
