package at.rad.project.Exercises.Loops;

public class SumEveryThirdNumber {
    
public static void main(String[] args) {
    int sum = 0;
    for(int i = 1; i <= 30; i++){
        if(i % 3 == 0){
            sum+=i;
        }
    }
    System.out.println(sum);
}
}
