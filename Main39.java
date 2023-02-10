import java.util.*;
public class Main39 {

	public static String solution(String str){
		StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                char ch=str.charAt(i);
                sb.append(ch);
            }
            else{
                char ch=str.charAt(i);
                char ch1=str.charAt(i+1);
                sb.append(ch);
                sb.append(ch1-ch);
            }
        }

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));


        scn.close();
	}

}
