import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";
        List<Character> characters = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(";");
                String type = parts[0];
                String name = parts[1];
                int maxHealth = Integer.parseInt(parts[2]);
                int attackPower = Integer.parseInt(parts[3]);

                if (type.equalsIgnoreCase("W")) {
                    characters.add(new Warrior(name, maxHealth, attackPower));
                } else if (type.equalsIgnoreCase("M")) {
                    int maxMana = Integer.parseInt(parts[4]);
                    int spellCost = Integer.parseInt(parts[5]);
                    characters.add(new Mage(name, maxHealth, attackPower, maxMana, spellCost));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file input: " + e.getMessage());
            return;
        }

        if (characters.size() < 2) {
            System.out.println("Cần ít nhất 2 nhân vật để bắt đầu trận đấu.");
            return;
        }

        Arena arena = new Arena();
        arena.startBattle(characters.get(0), characters.get(1));
    }
}