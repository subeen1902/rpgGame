package rpgGame.MonsterTypes;

import rpgGame.Monster;
import rpgGame.PotionTypes;

public class Dragon extends Monster {
    public Dragon() {
        super("드래곤", 250, 60, "Legend", PotionTypes.LARGE, 3);
    }
}
