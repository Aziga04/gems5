public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.getProtestion("mag");
        System.out.println(" " + boss.getHealth() + " " + " " + boss.getDamage()
                + " " + " " + boss.getProtestion("mag"));


        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage() + " " + createHeroes()[i].getHealth() + " " + createHeroes()[i].getSuperAbility());

        }
    }

    public static Hero[] createHeroes() {
        Hero heroOne = new Hero(350, 20);
        Hero heroTwo = new Hero(350, 20);
        Hero heroThree = new Hero(150, 80,"mag");
        Hero[] heroes = {heroOne, heroTwo,heroThree};


        return heroes;
    }
}


