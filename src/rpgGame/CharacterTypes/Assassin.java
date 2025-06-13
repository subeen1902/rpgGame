package rpgGame.CharacterTypes;

import rpgGame.Adventurer;
import rpgGame.Character;

public class Assassin extends Adventurer {
    public Assassin(String name) {
        super(name, 150, 150, 30, 80, 30, 70);
    }

    @Override
    public void attack(Character target) {
        System.out.println("도적이 기본 공격을 합니다!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useSkill(Character target){
        if(MP >= skillMPCost){
            System.out.println("도적이 스킬 '강타'를 사용합니다!");
            useMP(skillMPCost);
            target.takeDamage(skillDamage);
        }
        else {
            System.out.println("MP가 부족합니다!");
        }
    }
}
