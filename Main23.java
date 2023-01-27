import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int [][]arr=new int[r][c];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++)
            arr[i][j]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
