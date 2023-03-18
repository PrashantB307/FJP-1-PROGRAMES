import java.util.Scanner;

public class Pat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==1 || j==n)
                System.out.print("*\t");
                else if((i<=n/2+1)&&(i+j==n+1 || i==j))
                System.out.print("*\t");
                else{
                System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}

