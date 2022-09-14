public class Hero {
    private int health;
    private int damage;
    private int power;

    public Hero(){}

    public Hero(int health,int damage,int power){
        this.health = health;
        this.damage = damage;
        this.power = power;
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

    public int getPower() {
        return power;
    }
}
