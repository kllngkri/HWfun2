public class Animal {
    private String name;
    private int age;

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return this.age;
    }

    public void move() {
        System.out.println(getName() + ": How should I move?");
    }
}