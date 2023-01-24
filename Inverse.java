import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,inv=0;
        while(n>0){
            int rem=n%10;
            inv=inv +p*(int)Math.pow(10, rem-1);
            n=n/10;
            p++;
        }
        System.out.println(inv);
        sc.close();
    }
    
}
