import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int dig=0;
        int m=n;
        while(m!=0){
            m=m/10;
            dig++;
        }
       int i=1,max=0,ans;
       int qpow=(int) Math.pow(10,dig);
       int rpow=(int) Math.pow(10,dig-1);
       while(i<=dig){
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