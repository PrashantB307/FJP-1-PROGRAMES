import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int temp=n,d=0;
        while(temp!=0){ 
            temp=temp/10;
            d++;
        }
        k=k%d;
        if(k<0)
        k=k+d;
        int div=1,mult=1;
        for(int i=1;i<=d;i++){
            if(i<=k)
            div=div*10;
            else
            mult=mult*10;
        }
        int q=n/div;
        int r=n%div;
        int ans=r*mult+q;
        System.out.println(ans);
        kb.close();
    }
    
}
