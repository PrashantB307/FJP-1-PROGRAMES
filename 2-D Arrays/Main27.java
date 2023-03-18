import java.util.*;

public class Main27{

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int [][]arr= new int [n][m];
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
       } 
       int minr=0,minc=0;
       int maxr=arr.length-1;
       int maxc=arr[0].length-1;
       int total=n*m;
       int c=1;
       while(c<=total){
        for(int i=minr;i<=maxr && c<=total;i++){
            System.out.println(arr[i][minc]);
            c++;
        }
        minc++;
        for(int j=minc;j<=maxc && c<=total;j++){
            System.out.println(arr[maxr][j]);
            c++;
        }
        maxr--;
        for(int i=maxr;i>=minr&&c<=total;i--){
            System.out.println(arr[i][maxc]);
            c++;
        }
        maxc--;
        for(int j=maxc;j>=minc && c<=total;j--){
            System.out.println(arr[minr][j]);
            c++;
        }
        minr++;
       }
       sc.close();
    }
}