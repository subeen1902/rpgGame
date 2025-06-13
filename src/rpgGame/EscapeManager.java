package rpgGame;

import java.util.Random;

public class EscapeManager {
    private static final Random random = new Random();

    public static boolean tryEscape(Adventurer player) {
        int roll = random.nextInt(100);
        int successRate = player.getEscapeRate();

        if (roll < successRate) {
            System.out.println("성공적으로 도망쳤습니다!");
            return true;
        } else {
            System.out.println("도망에 실패하였습니다!");
            return false;
        }
    }
}