package rpgGame;

import rpgGame.MonsterTypes.*;

import java.util.Random;

public class MonsterFactory {
    private static final Random random = new Random();

    public static Monster createRandomMonster() {
        int roll = random.nextInt(100);

        if (roll < 5) return new Dragon();
        else if(roll < 15) return new Lich();
        else if(roll < 30) return new Ogre();
        else if(roll < 50) return new Orc();
        else return new Goblin();
    }
}
