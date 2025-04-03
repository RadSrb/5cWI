package at.rad.project.MultiplesOf3and4;

public class MultiplesOf3and4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
               System.out.println(i);     
            }
        }
    }

}
