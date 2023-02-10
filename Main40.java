import java.util.ArrayList;

public class Main40 {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        list = new ArrayList<>();
        System.out.println(list.size()+" "+ list);
        
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size() +" "+ list);
         
        list.set(1, 200);
        System.out.println(list.size() +" "+ list);
         
        list.add(0, 100);
        System.out.println(list.size()+ " "+ list );
         
        int val=list.get(3);
        System.out.println(val);

        list.remove(2);
        System.out.println(list.size()+" "+list);

        for(int i=0;i<list.size();i++){
            int val2=list.get(i);
            System.out.println(val2);
        }

    }
}
