import java.util.*;
public class Main50{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        displayArr(arr , 0);

        sc.close();
    }

    public static void displayArr(int[] arr, int i){
        if(i==arr.length)
        return;
        System.out.println(arr[i]);
        displayArr(arr, i+1);
        
    }

}
