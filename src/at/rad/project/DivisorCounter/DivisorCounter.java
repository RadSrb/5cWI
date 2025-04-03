package at.rad.project.DivisorCounter;

public class DivisorCounter {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;

        for (int i = 1; i <= 30; i++) {
            num = i;
            count = 0;
            
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            System.out.println("The number " + num + " has " + count + " divisors.");

        }
    }

}
