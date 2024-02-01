import java.util.ArrayList;

public class Cow extends Animal{
    private ArrayList<Animal> animals;
    private boolean check = true;
    public Cow(String name, Point2D position, ArrayList<Animal> animals) {
        super(name, position);
        this.animals = animals;
    }

    @Override
    public void move() {
        setCheck();
        if (!check){
            System.out.println(super.getName() + ": I can’t move. I’m scared.");
        }else System.out.println(super.getName() + ": I'm walking.");

    }

    private void setCheck(){
        for (int i = 0;i < animals.size();i++){
            if (animals.get(i) instanceof Tiger && super.getPosition().distance(animals.get(i).getPosition()) <= 100 ){
                this.check = false;
                break;
            }
        }

    }

}
