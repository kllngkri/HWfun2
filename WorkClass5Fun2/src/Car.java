public class Car extends Vehicle{
    public Car(String type,int fuel){
        super(type,fuel);
    }

    public Car(String type){
        super(type);
    }

    @Override
    public void move() {
        System.out.println(getType() + " is driving. "+getFuel()+" fuels. " );
    }
}
