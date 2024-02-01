public class Canoe extends Vehicle{
    public Canoe(String type){
        super(type);
    }

    public Canoe(String type,int fuel){
        super(type,fuel);
    }

    @Override
    public void move() {
        System.out.println(getType() + " is rowing. "+getFuel()+" fuels. ");
    }
}
