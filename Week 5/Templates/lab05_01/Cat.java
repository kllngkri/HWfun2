public class Cat extends Animal{
    public Cat(String name,int age){super(name,age);}



    @Override
    public void move(){
        if (super.getAge() <= 1){
            System.out.println(getName() + ": I'm walking.");
        }else System.out.println(getName() + ": I'm running.");
    }
}
