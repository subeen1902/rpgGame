package rpgGame;

public enum PotionTypes {
    SMALL(20, 20),
    MEDIUM(50, 50),
    LARGE(100, 100);

    public final int HPHeal;
    public final int MPHeal;

    PotionTypes(int HPHeal, int MPHeal) {
        this.HPHeal = HPHeal;
        this.MPHeal = MPHeal;
    }
}
