package at.rad.project.AlternatingTruthTable;

public class AlternatingTruthTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            boolean isEven = false;
            if (i % 2 == 0) {
                isEven = true;
                System.out.println("Number " + i + ": " + isEven);
            } else {
                System.out.println("Number " + i + ": " + isEven);
            }
        }
    }
}
