package at.rad.project.Exercises.Loops;

public class SumofSquares {
    
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
