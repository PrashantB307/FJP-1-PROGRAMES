import java.util.*;

public class Main43 {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       printIncreasing(n);

       sc.close();
    }

    public static void printIncreasing(int n){
        if(n==0){
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n);
        
    }

}