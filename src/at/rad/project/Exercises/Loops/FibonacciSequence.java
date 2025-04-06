package at.rad.project.Exercises.Loops;

public class FibonacciSequence {
    
public static void main(String[] args) {
    int n = 10; 
    int a = 0, b = 1; 

    

    for (int i = 2; i < n; i++) {
        int nextTerm = a + b;
        System.out.print(nextTerm + " ");
        a = b;
        b = nextTerm;
    }
    
}

}
