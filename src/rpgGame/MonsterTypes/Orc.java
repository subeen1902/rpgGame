package rpgGame.MonsterTypes;

import rpgGame.Monster;
import rpgGame.PotionTypes;

public class Orc extends Monster {
    public Orc() {
        super("오크", 100, 30, "Uncommon", PotionTypes.SMALL, 2);
    }
}
