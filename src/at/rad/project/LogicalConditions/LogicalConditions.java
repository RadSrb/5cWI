package at.rad.project.LogicalConditions;

public class LogicalConditions {
    

    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++){
            if(i % 3 == 0 && i % 2 ==0)
            {
                System.out.println("Even & Divisible by 3");
            }else if(i % 3 ==0){
                System.out.println("Divisible by 3");
            }else if(i % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println(i);
            }
        }
    }
}
