import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int div=1;
        int temp=n;
        while(temp>=10){
            temp=temp/10;
            div *=10;
        }
        while(div>=1){
            int q=n/div;
            int r=n%div;
            System.out.print(q+" ");    
            n=r;
            div=div/10;

        }
        sc.close();
    }
    
}
