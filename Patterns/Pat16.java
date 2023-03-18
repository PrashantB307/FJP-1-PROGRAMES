import java.util.Scanner;

public class Pat16 {
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
            int n =sc.nextInt();
            int i,j;
            for(i=0;i<n;i++){
                int val=1;
                for(j=0;j<=i;j++){
                System.out.print(val+"\t");
                val=val*(i-j)/(j+1);
                }
                System.out.println();
            }
    }
}