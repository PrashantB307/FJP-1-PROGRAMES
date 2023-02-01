import java.util.Scanner;
public class Pat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            if(i==1){
                for(j=1;j<=n;j++){
                    if(j<=n/2+1 || j==n)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
            }
            else if(i<=n/2){
                for(j=1;j<n;j++){
                    if(j==n/2+1 || j==n)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
            }
            else if(i==n/2+1){
                for(j=1;j<=n;j++)
                System.out.print("*\t");
            }
            else if(i<n){
                for(j=1;j<=n;j++){
                    if(j==1 || j==n/2+1)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
            }
            else{
                for(j=1;j<=n;j++){
                    if(j>=n/2+1 || j==1)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
