import java.util.*;

public class Main48 {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        pzz(n); 

        sc.close();
    }

    public static void pzz(int n){
        if(n==0){
            return ;
        }
        System.out.println(n+" ");
        pzz(n-1);
        System.out.println(n+" ");
        pzz(n-1);
        System.out.println(n+" ");
    }

}