package rpgGame.MonsterTypes;

import rpgGame.Monster;
import rpgGame.PotionTypes;

public class Lich extends Monster {
    public Lich() {
        super("리치", 200, 50, "Unique", PotionTypes.MEDIUM, 2);
    }
}
