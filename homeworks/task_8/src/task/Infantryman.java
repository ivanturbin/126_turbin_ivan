package task;

public class Infantryman extends BattleUnitBase {
    public Infantryman (String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
}
    @Override
    public void specialAbility (BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {

    }

    @Override
    public void attack (BattleUnit other) {
        double hstrength = (this.strength()/2);
        double qstrength = (this.strength()/4);
        if (hstrength < 1){
            hstrength = 1;
        }
        if (qstrength < 1){
            qstrength = 1;
        }
        if (other.armor() > 0){
            other.takeDamage((int) hstrength);
            other.damageArmor((int) qstrength);
        }
        else {
            other.takeDamage((int) this.strength);
        }
    }
}
