package asteroidGame;

public class AsteroidMain {

    public static void main(String[] args) {

        //game
        //levels = i
        for (int i = 1; i <= 5; i++) {
            System.out.println("starting round " + i);
            for (int j = 0; j < 20; j++) {
                System.out.println(Asteroid.createObject(i));
            }
        }
        System.out.println("the End");

    }
}
