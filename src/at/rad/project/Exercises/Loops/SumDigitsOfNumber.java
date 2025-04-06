package at.rad.project.Exercises.Loops;

public class SumDigitsOfNumber {
    
public static void main(String[] args) {
    int number = 1654; 
    int sum = 0;
    
    while (number > 0) {
        int digit = number % 10; 
        sum += digit; 
        number /= 10; 
    }
    
    System.out.println(sum); 
}

}
