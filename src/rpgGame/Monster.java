package rpgGame;

public class Monster extends Character {
    protected int attackPower;
    protected String rank;
    protected PotionTypes dropPotionType;
    protected int dropCount;

    public Monster(String name, int maxHP, int attackPower, String rank, PotionTypes dropPotionType, int dropCount) {
        super(name, maxHP, 0);
        this.attackPower = attackPower;
        this.rank = rank;
        this.dropPotionType = dropPotionType;
        this.dropCount = dropCount;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + "이(가) 공격합니다.");
        target.takeDamage(attackPower);
    }

    public String getRank() {
        return rank;
    }

    public PotionTypes getDropPotionType() {
        return dropPotionType;
    }

    public int getDropCount() {
        return dropCount;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
