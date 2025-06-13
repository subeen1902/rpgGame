package rpgGame;

import java.util.Scanner;

public class SelectJob {
    public static void selectJob(Scanner sc) {
        System.out.println("👨🏻‍🎤 직업을 선택해주세요.");
        System.out.println("--------직업 목록--------");
        System.out.println("1. 💣 전사(Warrior)");
        System.out.println("2. 🏹 궁수(Archer)");
        System.out.println("3. 🦹🏻‍♂️ 성기사(Paladin)");
        System.out.println("4. 🧝🏻‍♀️ 성직자(Priest)");
        System.out.println("5. 🧙🏻‍♂️ 마법사(Wizard)");
        System.out.println("6. 🥷🏻 도적(Assassin)");
        System.out.println("-----------------------");
        System.out.println("직업 번호를 입력하세요 : ");

        String input = sc.nextLine();

        switch (input) {
            case "1":
                System.out.println("전사를 선택하셨습니다! 대검을 장착합니다.");
                break;
            case "2":
                System.out.println("궁수를 선택하셨습니다! 활을 장착합니다.");
                break;
            case "3":
                System.out.println("성기사를 선택하셨습니다! 검과 방패를 장착합니다.");
                break;
            case "4":
                System.out.println("성직자를 선택하셨습니다! 성서를 장착합니다.");
                break;
            case "5":
                System.out.println("마법사를 선택하셨습니다! 지팡이를 장착합니다.");
                break;
            case "6":
                System.out.println("도적을 선택하셨습니다! 단검을 장착합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                return;
        }
        System.out.println("선택한 직업이 던전을 탐헙합니다.");
    }
}
