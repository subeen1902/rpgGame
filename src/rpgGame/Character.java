package rpgGame;

public abstract class Character {
    protected String name;
    protected int maxHP;
    protected int HP;
    protected int maxMP;
    protected int MP;

    public Character(String name, int maxHP, int maxMP) {
        this.name = name;
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.maxMP = maxMP;
        this.MP = maxMP;
    }

    public String getName() {
        return name;
    }

    public boolean isDead(){
        return HP <= 0;
    }

    public void takeDamage(int damage){
        HP -= damage;
        if(HP < 0) HP = 0;
    }

    public void heal(int amount){
        HP += amount;
        if(HP > maxHP) HP = maxHP;
    }

    public void useMP(int amount){
        MP -= amount;
        if(MP < 0) MP = 0;
    }

    public abstract void attack(Character target);
}
