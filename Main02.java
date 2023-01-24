import java.util.*;
  
  public class Main02{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      scn.close();
   }
  
   public static int getValueInBase(int n, int b){
       int rev=0;
       int dig,p=1;
       while(n>0){
           dig=n%b;
           rev=rev+dig*p;
           n=n/b;
           p=p*10;
       }
       return rev;
   }
  }