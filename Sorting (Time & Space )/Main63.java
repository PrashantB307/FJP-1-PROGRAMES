import java.util.Scanner;

public class Main63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int c=n;
        int pox=x;
        int ans=0;
        while(c>=1){
            int term=c*pox;
            ans += term;
            c--;
            pox=pox*x;
        }
        System.out.println(ans);


        sc.close();

    }
    
}
