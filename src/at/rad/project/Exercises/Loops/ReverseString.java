package at.rad.project.Exercises.Loops;

public class ReverseString {
        
        public static void main(String[] args) {
            String original = "Hello";
            String reversed = "";
            
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);
            }
            
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);

        }
}
