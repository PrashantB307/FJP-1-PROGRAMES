public class Main37 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
         
        char ch= sb.charAt(0);  //for 1st char print
        System.out.println(ch);

        sb.setCharAt(0, 'b'); //change char
        System.out.println(sb);

        sb.deleteCharAt(0);  //remove char
        System.out.println(sb);

        sb.insert(0, 't');  // insert char
        System.out.println(sb);


    }
    
}
