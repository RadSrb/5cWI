package at.rad.project.Exercises;

public class SumWithoutMultiplesOfFive {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
