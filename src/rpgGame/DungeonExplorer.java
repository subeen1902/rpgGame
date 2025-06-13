package rpgGame;

import rpgGame.Monster;
import rpgGame.MonsterFactory;
import java.util.Scanner;

public class DungeonExplorer extends DungeonBase {

    public DungeonExplorer(Adventurer player, PotionBag potionBag, Scanner sc) {
        super(player, potionBag, sc);
    }

    @Override
    public void start() {
        while (!player.isDead()) {
            Monster monster = MonsterFactory.createRandomMonster();
            System.out.println(monster.getName() + " [" + monster.getRank() + "] 이(가) 나타났습니다!");

            while (!monster.isDead() && !player.isDead()) {
                System.out.println("1. 싸운다");
                System.out.println("2. 도망간다");
                String choice = sc.nextLine();

                if (choice.equals("1")) {
                    BattleManager.handleBattle(player, monster, potionBag, sc);
                } else if (choice.equals("2")) {
                    if (EscapeManager.tryEscape(player)) break;
                    else {
                        System.out.println("도망에 실패한 대가로 데미지를 입습니다!");
                        monster.attack(player);
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }

            if (player.isDead()) {
                printSummary(true);
                break;
            } else if (monster.isDead()) {
                killCount++;
                System.out.println("몬스터를 처치했습니다!");
                potionBag.add(monster.getDropPotionType(), monster.getDropCount());
                System.out.println("몬스터가 " + monster.getDropPotionType() + " 포션을 " + monster.getDropCount() + "개 드랍했습니다.");
            }

            postBattleMenu();
        }
    }

    private void postBattleMenu() {
        System.out.println(player.getName() + " HP: " + player.HP + ", MP: " + player.MP + ", 처치한 몬스터 수: " + killCount);
        System.out.println("1. 탐험을 계속한다.");
        System.out.println("2. 포션을 마신다.");
        System.out.println("3. 탐험을 그만둔다.");

        String input = sc.nextLine();

        switch (input) {
            case "1": return;
            case "2":
                potionBag.printInventory();
                System.out.println("사용할 포션 번호를 선택하세요 (1. SMALL 2. MEDIUM 3. LARGE):");
                String choice = sc.nextLine();
                PotionTypes type = switch (choice) {
                    case "1" -> PotionTypes.SMALL;
                    case "2" -> PotionTypes.MEDIUM;
                    case "3" -> PotionTypes.LARGE;
                    default -> null;
                };
                if (type != null) potionBag.use(type, player);
                else System.out.println("잘못된 입력입니다.");
                break;
            case "3":
                printSummary(false);
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}