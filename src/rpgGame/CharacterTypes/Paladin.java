package rpgGame.CharacterTypes;

import rpgGame.Adventurer;
import rpgGame.Character;

public class Paladin extends Adventurer {
    public Paladin(String name) {
        super(name, 200, 150, 40, 90, 30, 50);
    }

    @Override
    public void attack(rpgGame.Character target) {
        System.out.println("성기사가 기본 공격을 합니다!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useSkill(Character target){
        if(MP >= skillMPCost){
            System.out.println("성기사가 스킬 '강타'를 사용합니다!");
            useMP(skillMPCost);
            target.takeDamage(skillDamage);
        }
        else {
            System.out.println("MP가 부족합니다!");
        }
    }
}
