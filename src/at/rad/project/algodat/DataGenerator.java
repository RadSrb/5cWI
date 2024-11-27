package at.rad.project.algodat;

import java.util.Random;

public class DataGenerator {
    
    public static int[] generateDataArray(int size) {
            Random rand = new Random();
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt();
            }
            return data;
    }
    
}
