package at.rad.project.Exercises.Loops;

public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 3;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
      
    }
}
