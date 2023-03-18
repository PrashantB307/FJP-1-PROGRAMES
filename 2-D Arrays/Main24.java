import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int i,j;
        int [][]arr1=new int[n1][m1];
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr1[0].length;j++)
            arr1[i][j]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int [][]arr2=new int[n2][m2];
        for(i=0;i<arr2.length;i++){
            for(j=0;j<arr2[0].length;j++)
            arr2[i][j]=sc.nextInt();
        }
        if(m1!=n2){
            System.out.println("Invalid input");
            return;
        }
        int[][]prd=new int[n1][m2];
        for(i=0;i<prd.length;i++){
            for(j=0;j<prd[0].length;j++){
                int val=0;
                for(int k=0;k<m1;k++){
                    val+=arr1[i][k]*arr2[k][j];
                }
                prd[i][j]=val;
            }
        }
        for(i=0;i<prd.length;i++){
            for(j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
         
    }
}
