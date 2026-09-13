public class Warrior extends Character {
    private int rage;
    public Warrior(String name, int maxHealth, int attackPower) {
        super(name, maxHealth, attackPower);
        this.rage = 0;
    }

    @Override
    public void attack(Combatant target){
        System.out.println(name + "swing his mighty axe at " + ((Character)target).name + "!");
        target.takeDamage(this.attackPower);
        this.rage+=10;
    }
}
