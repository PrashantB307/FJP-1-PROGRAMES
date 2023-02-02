import java.util.Scanner;

public class Pat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int i,j;
        int st=1,sp=2*n-3;
        for(i=1;i<=n;i++){
            int val=1;
            for(j=1;j<=st;j++){
                System.out.print(val +"\t");
                val++;
            }
            for(j=1;j<=sp;j++)
            System.out.print("\t");
            if(i==n){
            st--;
            val--;
            }
            for(j=1;j<=st;j++){
                val--;
                System.out.print(val +"\t");
            }
            st++;
            sp-=2;
            System.out.println();
        }
    }
}
