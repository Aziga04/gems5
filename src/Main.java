import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss bossOne = new Boss();
        bossOne.setHealth(700);
        bossOne.setDamage(50);
        bossOne.setDefence(100);
        System.out.println("Boss Health: " + bossOne.getHealth() + " " + "Boss Damage: " + bossOne.getDamage()
                + " " + "Boss Defence: " + bossOne.getDefence());


        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(Arrays.toString(createHeroes()));

        }
    }

    public static Hero[] createHeroes() {
        Hero heroOne = new Hero(350, 20);
        Hero heroTwo = new Hero(350, 20, 70);
        Hero heroThree = new Hero(150, 80);
        Hero[] heroes = {heroOne, heroTwo,heroThree};


        return heroes;
    }
}


