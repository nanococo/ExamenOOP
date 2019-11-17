package Bolitas;

import java.util.Random;

public class RandomGenerator {
    public static int generateInt(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }
}
