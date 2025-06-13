package rpgGame;

public abstract class Adventurer extends Character {
    protected int attackPower;
    protected int skillDamage;
    protected int skillMPCost;
    protected int escapeRate;

    public Adventurer(String name, int maxHP, int maxMP, int attackPower, int skillDamage, int skillMPCost, int escapeRate) {
        super(name, maxHP, maxMP);
        this.attackPower = attackPower;
        this.skillDamage = skillDamage;
        this.skillMPCost = skillMPCost;
        this.escapeRate = escapeRate;
    }

    public abstract void useSkill(Character target);
    public abstract void attack(Character target);

    public int getEscapeRate() {
        return escapeRate;
    }
}
