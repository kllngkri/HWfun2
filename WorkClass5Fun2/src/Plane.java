public class Plane extends Vehicle{
    public Plane(String type){
        super(type);
    }

    public Plane(String type,int fuel){
        super(type,fuel);
    }

    @Override
    public void move() {
        System.out.println(getType() + "is frying. "+getFuel()+" fuels. ");
    }
}
