import java.util.Scanner;

public class Pat18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=sp;j++){
                if(i==n/2+1)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            for(j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                st++;
            } else{
                st--;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
