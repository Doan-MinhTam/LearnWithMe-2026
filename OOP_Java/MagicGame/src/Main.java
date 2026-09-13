public class Main {
    public static void main(String[] args) {
        // Khởi tạo trực tiếp nhân vật trong code, không cần đọc file input.txt
        // Warrior(name, maxHealth, attackPower)
        Character c1 = new Warrior("Grommash", 120, 25);

        // Mage(name, maxHealth, attackPower, maxMana, spellCost)
        Character c2 = new Mage("Jaina", 80, 40, 50, 30);

        Arena arena = new Arena();
        arena.startBattle(c1, c2);
    }
}