import java.util.*;

public class Main46 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        int xpn=power(x, n);
        System.out.println(xpn);

        sc.close();
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpn=x*power(x, n-1);
        return xpn;
    }

}
