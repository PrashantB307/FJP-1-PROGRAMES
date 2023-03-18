import java.util.*;
  
  public class Main03{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
      scn.close();
   }
  
   public static int getValueIndecimal(int n, int b){
     int rev=0;
     int p=1,dig;
     while(n>0){
         dig=n%10;
         rev=rev+dig*p;
         n=n/10;
         p=p*b;
     }
     return rev;
   }
  }