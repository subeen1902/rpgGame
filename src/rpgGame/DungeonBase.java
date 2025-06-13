package rpgGame;

import rpgGame.Monster;
import java.util.Scanner;

public abstract class DungeonBase {
    protected Adventurer player;
    protected PotionBag potionBag;
    protected Scanner sc;
    protected int killCount = 0;

    public DungeonBase(Adventurer player, PotionBag potionBag, Scanner sc) {
        this.player = player;
        this.potionBag = potionBag;
        this.sc = sc;
    }

    public abstract void start();  // 탐험 흐름 정의

    protected void printSummary(boolean isDead) {
        System.out.println("--------------------------------");
        System.out.println(isDead ? player.getName() + "이(가) 사망하였습니다." : "탐험을 종료합니다.");
        System.out.println("선택한 직업: " + player.getClass().getSimpleName());
        System.out.println("남은 HP: " + player.HP);
        System.out.println("남은 MP: " + player.MP);
        System.out.println("처치한 몬스터 수: " + killCount);
        System.out.println("----------------------------------");
    }
}