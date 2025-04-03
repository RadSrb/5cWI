package at.rad.project.Exercises;

public class BoomZero {
    
public static void main(String[] args) {
    for(int i = 1; i <= 100; i++){
        if(i % 10 == 0){
            System.out.println("Boom");
        } else{
            System.out.println(i);
        }
    }
}

}
