import java.util.Scanner;

public class Pat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
            System.out.print("*\t");
            m--;
            System.out.println();
        }
        sc.close();
    }
    
}
