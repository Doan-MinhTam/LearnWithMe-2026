public class Mage extends Character {
    private int mana;
    private int maxMana;
    private int spellCost;

    public Mage(String name, int maxHealth, int attackPower, int mana, int maxMana, int spellCost) {
        super(name, maxHealth, attackPower);
        this.mana = mana;
        this.maxMana = maxMana;
        this.spellCost = spellCost;
    }

    @Override
    public void attack(Combatant target){
        if (mana < spellCost) {
            throw new InsufficientManaException(name + "does not have enough mana to cast a spell");
        }
        System.out.println(name + "cast a powerfull fireball at" +((Character)target).name + "!");
        this.mana -= spellCost;
        target.takeDamage(mana);
    }

    public void recoverMana() {
        this.mana += 10;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + " [Mana: " + mana + "/" +maxMana + "]";
    }
}
