public class Monk extends GameCharacter {
    public Monk(String name, int hp, int str, int dex, int wis) {
        super(name, hp, str, dex, wis);
    }

    @Override
    public void attack(GameCharacter opponent) {
        if (status == Status.DEAD) {
            System.out.println("Dead person cannot attack.");
        } else {
            System.out.printf("%s attacks %s.\n", name, opponent.name);
            opponent.takeHits(dexterity);
        }
    }
}
