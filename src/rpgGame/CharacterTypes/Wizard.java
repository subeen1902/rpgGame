package rpgGame.CharacterTypes;

import rpgGame.Adventurer;
import rpgGame.Character;

public class Wizard extends Adventurer {
    public Wizard(String name) {
        super(name, 110, 250, 20, 100, 50, 20);
    }

    @Override
    public void attack(Character target) {
        System.out.println("마법사가 기본 공격을 합니다!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useSkill(Character target){
        if(MP >= skillMPCost){
            System.out.println("마법사가 스킬 '강타'를 사용합니다!");
            useMP(skillMPCost);
            target.takeDamage(skillDamage);
        }
        else {
            System.out.println("MP가 부족합니다!");
        }
    }
}

