import java.util.*;

public class Main45 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn=factorial(n);
        System.out.println(fn);

        sc.close();
    }

    public static int factorial(int n){
       if(n==0){
        return 1;
       }
       int fn=n*factorial(n-1);
       return fn;
    }

}