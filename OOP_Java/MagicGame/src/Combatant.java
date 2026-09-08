public interface Combatant {
    void attack(Combatant target);
    void takeDamage(int damage);
    boolean isAlive();
}
