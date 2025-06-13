package rpgGame.MonsterTypes;

import rpgGame.Monster;
import rpgGame.PotionTypes;

public class Goblin extends Monster {
    public Goblin() {
        super("고블린", 50, 20, "Common", PotionTypes.SMALL, 1);
    }
}
