package asteroidGame;

public class Asteroid {
    public int size;
    public int speed;

    public Asteroid(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }

    public static Asteroid createObject(int level) {//1 to 10
        //logic random between 1 to 10 * level
        int randomSize = (int) (Math.random()* 10 + 1);//random between 1 to 10
        int randomSpeed = (int) (Math.random()* 50 +1);//random between 1 to 50
        Asteroid asteroid = new Asteroid(randomSize * level,randomSpeed * level );
        return asteroid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
