import java.util.*;

public class Demo_Queue {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(40);
        pq.add(33);
        pq.add(57);
        pq.add(10);
        pq.add(67);
       
        System.out.println(pq.peek());  //--> 10
        pq.remove();   //--> 10
 
        System.out.println(pq.peek());  //--> 20
        pq.remove();  //--> 20

        System.out.println(pq.peek());  //--> 33
        pq.remove();  //--> 33

        System.out.println(pq.peek());  //--> 40
        pq.remove();  //--> 40

        System.out.println(pq.peek());  //--> 57
        pq.remove();  //--> 57

        System.out.println(pq.peek());  //--> 67
        pq.remove();  //--> 67


        int [] arr ={10, 57, 33, 44, 56, 11, 98};
        for(int val : arr){
            pq.add(val);
        }

        while(pq.size() > 0){
            System.out.print(pq.peek() + " ");  //==> 10 11 33 44 56 57 98
            pq.remove();
        }
    }
}
