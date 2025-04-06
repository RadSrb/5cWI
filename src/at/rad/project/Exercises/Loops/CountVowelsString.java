package at.rad.project.Exercises.Loops;

public class CountVowelsString {

    public static void main(String[] args) {
        String input = "Hello World!";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        System.out.println(input);
        System.out.println(count);
    }
}
