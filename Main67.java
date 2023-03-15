import java.util.*;

public class Main67{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int dupli = -1;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]){
                dupli=arr[i];
                break;
            }
        }
        System.out.println(dupli);

        sc.close();
    }
}