import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qpow=10000;
        int rpow=1000;
        int i=1,max=1;
        int ans;
        while(i<=4){
            ans=(n/qpow)*rpow+(n%rpow);
            qpow=qpow/10;
            rpow=rpow/10;
            if(ans>max)
            max=ans;
            i++;
        }
        System.out.println(max);
        sc.close();
    }
    
}
