package task;

public class Alchemist extends BattleUnitBase {
    public Alchemist (String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxHealth = 0;
        int minHealth = Integer.MAX_VALUE;
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < ownTeam.length; i++){
            BattleUnit own = ownTeam[i];
            if ((own.health()>maxHealth) && (own.health()>0)){
                maxHealth = own.health();
                number1 = i;
            }
            if ((own.health()<maxHealth) && (own.health()>0)){
                minHealth = own.health();
                number2 = i;
            }
        }
        final BattleUnit ownMaxHealth = ownTeam[number1];
        final BattleUnit ownMinHealth = ownTeam[number2];
        ownMinHealth.heal(10);
        ownMaxHealth.setStrength(ownMaxHealth.strength() + 1);
    }

    @Override
    public void attack(BattleUnit other) {
        other.setStrength(other.strength() - 2);
        other.setMaxHealth(other.maxHealth() - 4);
    }
}
