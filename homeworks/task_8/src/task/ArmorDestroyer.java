package task;

public class ArmorDestroyer extends BattleUnitBase {
    public ArmorDestroyer (String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxEnemyArmor = 0;
        int number = 0;
        for (int i = 0; i < enemyTeam.length; i++){
            BattleUnit enemy = enemyTeam[i];
            if ((enemy.armor()>maxEnemyArmor) && (enemy.health()>0)){
                maxEnemyArmor = enemy.armor();
                number = i;
            }
        }
        final BattleUnit enemy = enemyTeam[number];
        double sstrength = (this.strength()*2);
        double qstrength = (this.strength()/4);
        if (sstrength < 1){
            sstrength = 1;
        }
        if (qstrength < 1){
            qstrength = 1;
        }
        if (enemy.armor() > 0){
            enemy.damageArmor((int) sstrength);
        }
        else {
            enemy.takeDamage((int) qstrength);
        }
    }
    @Override
    public void attack(BattleUnit other) {
        double hstrength = (this.strength()/2);
        double qstrength = (this.strength()/4);
        if (hstrength < 1){
            hstrength = 1;
        }
        if (qstrength < 1){
            qstrength = 1;
        }
        if (other.armor() > 0){
            other.takeDamage((int) qstrength);
            other.damageArmor((int) this.strength);
        }
        else {
            other.takeDamage((int) hstrength);
        }
    }
}

