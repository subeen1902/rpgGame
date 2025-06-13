package rpgGame;

import rpgGame.Monster;
import java.util.Scanner;

public class BattleManager {
    public static void handleBattle(Adventurer player, Monster monster, PotionBag bag, Scanner sc) {
        while(!monster.isDead() && !player.isDead()) {
            System.out.println("1. 기본 공격");
            System.out.println("2. 스킬 사용");
            System.out.println("3. 포션 사용");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("몬스터를 공격합니다!");
                    player.attack(monster);
                    break;
                case "2":
                    player.useSkill(monster);
                    break;
                case "3":
                    bag.printInventory();
                    System.out.println("사용할 포션 번호? (1: SMALL, 2: MEDIUM, 3: LARGE)");
                    String choice = sc.nextLine();
                    PotionTypes type = switch (choice) {
                        case "1" -> PotionTypes.SMALL;
                        case "2" -> PotionTypes.MEDIUM;
                        case "3" -> PotionTypes.LARGE;
                        default -> null;
                    };
                    if (type != null) bag.use(type, player);
                    else System.out.println("잘못된 선택입니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

            if (!monster.isDead()) {
                monster.attack(player);
            }
        }
    }
}