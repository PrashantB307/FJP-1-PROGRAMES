import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sv = new Scanner (System.in);
        int n=sv.nextInt();
        while(n>0)
        {
            int rem=n%10;
            System.out.print(rem);
            n=n/10;
        }
        sv.close();
    }
    
}
