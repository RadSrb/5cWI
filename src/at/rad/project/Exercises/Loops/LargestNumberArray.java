package at.rad.project.Exercises.Loops;

import java.util.Random;

public class LargestNumberArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int largestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        } 

        System.out.println(largestNumber);

    }

}
