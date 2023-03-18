import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int [][]arr= new int [r][c];
        for( i=0;i<arr.length;i++){
            for( j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(i=0;i<arr.length;i++){
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(i=arr.length-1;i>=0;i--)
                System.out.println(arr[i][j]);
            }
        }
    }
}
