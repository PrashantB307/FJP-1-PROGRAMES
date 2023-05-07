import java.util.*;

public class Main17{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr=new int[n];
    int i,j;
    for( i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int lim=(1<<n);
    for(i=0;i<lim;i++){
        int dec=i;
        String str="";
        for(j=0;j<arr.length;j++){
            int rem=dec%2;
            dec=dec/2;
            if(rem==0){
                str="-\t"+str;
            }
            else{
                str=arr[arr.length-1-j]+"\t"+str;
            }
            
        }
        System.out.println(str);
    }
    sc.close();
 }

}