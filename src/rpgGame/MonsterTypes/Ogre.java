package rpgGame.MonsterTypes;

import rpgGame.Monster;
import rpgGame.PotionTypes;

public class Ogre extends Monster {
    public Ogre() {
        super("오우거", 150, 40, "Rare", PotionTypes.MEDIUM, 1);
    }
}
