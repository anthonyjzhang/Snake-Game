package java;
import java.util.Random;

public class Food {

    private final int XCoord;
    private final int YCoord;

    public Food() {
        XCoord = generatePos(Background.WIDTH);
        YCoord = generatePos(Background.HEIGHT);
    }

    private int generatePos(int size) {
        Random random = new Random();
        return random.nextInt(size / Background.TICK_SIZE) * Background.TICK_SIZE;
    }

    public int getPosX() {
        return XCoord;
    }

    public int getPosY() {
        return YCoord;
    }
}
