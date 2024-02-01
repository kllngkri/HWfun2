public class Mage extends GameCharacter{
    private int mana;
    public Mage(String name, int hp, int str, int dex, int wis,int mana) {
        super(name, hp, str, dex, wis);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter opponent) {
        if (status == GameCharacter.Status.DEAD) {
            System.out.println("Dead person cannot attack.");
        } else {
            if (mana < 0) {
                mana -= 1;
                System.out.printf("%s attacks %s with magic. Remaining mana: %d \n", name, opponent.name,mana);
                opponent.takeHits(wisdom);
            }else {
                System.out.printf("%s attacks %s.\n", name, opponent.name);
                opponent.takeHits(strength);
            }
        }
    }


}
