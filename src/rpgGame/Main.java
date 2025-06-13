package rpgGame;

import rpgGame.CharacterTypes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("⚔️ 모험가와 몬스터의 턴제 RPG ⚔️");
        System.out.println("1. 시작하기");
        System.out.println("2. 종료하기");
        System.out.println("선택지를 입력하세요 : ");

        String input = sc.nextLine();

        if(input.equals("2")){
            System.out.println("게임을 종료합니다.");
            return;
        } else if(!input.equals("1")){
            System.out.println("잘못된 입력입니다. 게임을 종료합니다.");
            return;
        }

        Adventurer player = SelectJob(sc);
        PotionBag potionBag = new PotionBag();

        DungeonBase explorer = new DungeonExplorer(player, potionBag, sc);
        explorer.start();
    }

    public static Adventurer SelectJob(Scanner sc) {
        while (true) {
            System.out.println("직업을 선택해주세요:");
            System.out.println("1. 전사 (Warrior)");
            System.out.println("2. 궁수 (Archer)");
            System.out.println("3. 성기사 (Paladin)");
            System.out.println("4. 성직자 (Priest)");
            System.out.println("5. 마법사 (Wizard)");
            System.out.println("6. 도적 (Assassin)");
            System.out.print("직업 번호 입력: ");
            String job = sc.nextLine();

            System.out.print("캐릭터 이름을 입력하세요: ");
            String name = sc.nextLine();

            return switch (job) {
                case "1" -> new Warrior(name);
                case "2" -> new Archer(name);
                case "3" -> new Paladin(name);
                case "4" -> new Prist(name);
                case "5" -> new Wizard(name);
                case "6" -> new Assassin(name);
                default -> {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
                    yield null;
                }
            };
        }
    }
}
