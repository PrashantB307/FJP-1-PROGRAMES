import java.util.*;
  
  public class Main04{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
     int  b2= scn.nextInt();
     int d=getvalue(n,b1,b2);
     System.out.println(d);
     scn.close();
   }   
   public static int getvalue(int n,int b1,int b2){
       int dec=getValueIndecimal( n, b1);
       int bs=getValueInBase( dec, b2);
       return bs;
       
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