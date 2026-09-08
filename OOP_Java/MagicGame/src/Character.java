public abstract class Character implements Combatant {
    protected  String name;
    protected  int health;
    protected  int maxHealth;
    protected  int attackPower;

    public Character(String name, int maxHealth, int attackPower) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attackPower = attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(this.name + "take" + damage + "damage, remaining health: " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getStatus() {
        return name + "[Health: " + health + "/" + maxHealth + "]";
    }
}
