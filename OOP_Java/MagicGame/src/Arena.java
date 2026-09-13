public class Arena {
    public void startBattle(Character c1, Character c2){
        System.out.println("========= BATTLE START =========");
        System.out.println(c1.getStatus() + " VS " + c2.getStatus());
        System.out.println("================================");

        Character attacker = c1;
        Character target = c2;

        int countTurn = 1;
        while (c1.isAlive() && c2.isAlive()){
            System.out.printf("Turn %d :", countTurn);
            System.out.println("----------------------------------------------------------");

            try {
                System.out.println(attacker.name + " is attack " + target.name + " and cause " + attacker.attackPower + " damage");
                attacker.attack(target);
            } catch (InsufficientManaException e) {
                System.out.println("Attack failed! " + e.getMessage());
                System.out.println(attacker.name + " skips a turn to recover.");
                ((Mage)attacker).recoverMana();
            }

            if (!target.isAlive()) {
                break;
            }

            System.out.println("Status after turn: ");
            System.out.println(c1.getStatus());
            System.out.println(c2.getStatus());

            Character temp = target;
            target = attacker;
            attacker = temp;
            countTurn++;
        }

        System.out.println("========= BATTLE END =========");
        System.out.println(c1.getStatus() + " VS " + c2.getStatus());
        if (c1.isAlive()) {
            System.out.println(c1.name + " is the WINNER!");
        }
        if (c2.isAlive()) {
            System.out.println(c1.name + " is the WINNER!");
        }
        System.out.println("==============================");
    }
}
