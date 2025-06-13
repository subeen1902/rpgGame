package rpgGame;

import java.util.HashMap;
import java.util.Map;

public class PotionBag {
    private Map<PotionTypes, Integer> inventory = new HashMap<>();

    public void add(PotionTypes type, int count) {
        inventory.put(type, inventory.getOrDefault(type, 0) + count);
    }

    public boolean use(PotionTypes type, Character target) {
        if(inventory.getOrDefault(type, 0) > 0) {
            target.heal(type.HPHeal);
            target.useMP(-type.MPHeal);
            inventory.put(type, inventory.getOrDefault(type, 0) - 1);
            System.out.println(target.getName() + "이(가)" + type.name() + "포션을 마십니다.");
            return true;
        }

        System.out.println("해당 포션이 없습니다.");
        return false;
    }

    public void printInventory() {
        for(PotionTypes type : PotionTypes.values()) {
            System.out.println(type + "포션 : " + inventory.getOrDefault(type, 0) + "개");
        }
    }
}
