public class Hero {
    int health;
     int damage;

     String superAbility;

    public Hero(){}

    public Hero(int health,int damage,String superAbility){
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
    public Hero(int health,int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }



    public String getSuperAbility() {
        return superAbility;
    }
}
