import java.util.*;
public class Main26 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [][]arr= new int[n][n];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
    } 
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr[0].length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    for(int i=0;i<arr.length;i++){
        int left=0,right=arr[i].length-1;
        while(left<right){
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
            left++;
            right--;
        }
    }
    display(arr);
    sc.close();
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}