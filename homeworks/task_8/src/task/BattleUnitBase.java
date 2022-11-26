package task;

    public abstract class BattleUnitBase implements BattleUnit {
        protected final String name;
        protected int maxArmor;
        protected int baseStrength;
        protected int maxHealth;
        protected int armor;
        protected int health;
        protected int strength;

        public BattleUnitBase(String name, int maxHealth, int baseStrength, int maxArmor) {
            this.name = name;
            this.maxHealth = this.health = maxHealth;
            this.baseStrength = this.strength = baseStrength;
            this.maxArmor = this.armor = maxArmor;
        }

        public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
        public abstract void attack(BattleUnit other);

        @Override
        public String name (){
            return this.name;
        }

        @Override
        public int health (){
        return this.health;
        }

        @Override
        public int maxHealth (){
            return this.maxHealth;
        }

        @Override
        public void setMaxHealth (int value){
            this.maxHealth=value;
            if (this.health >= maxHealth) {
                this.health=maxHealth;
            }
        }

        @Override
        public void heal (int value){
            this.health=this.health+value;
            if (this.health >= maxHealth) {
                this.health=maxHealth;
            }
        }

        @Override
        public void takeDamage (int value){
            this.health=this.health-value;
            if (this.health <= 0) {
                this.health=0;
            }
        }

        @Override
        public int strength (){
            return this.strength;
        }

        @Override
        public void setStrength (int value){
            this.strength=value;
        }

        @Override
        public int baseStrength (){
            return this.baseStrength;
        }

        @Override
        public int armor (){
            return this.armor;
        }

        @Override
        public void restoreArmor (int value){
            this.armor=this.armor + value;
            if (this.armor >= maxArmor) {
                this.armor=maxArmor;
            }
        }

        @Override
        public void damageArmor (int value){
            this.armor=this.armor - value;
            if (this.armor <= 0) {
                this.armor=0;
            }
        }

        @Override
        public int maxArmor (){
            return this.maxArmor;
        }

        @Override
        public void setMaxArmor (int value){
            this.maxArmor=value;
            if (this.armor >= maxArmor) {
                this.armor=maxArmor;
            }
        }
    }

