package at.rad.project.Exercises;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i % 1 == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
