import java.util.*;

public class Demo_G_Tree {
    public static class Node {
        int data;
        ArrayList<Node> Children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }
    public static void levelorder(Node root){
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);

        while(queue.size() > 0){
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child : temp.Children){
                queue.add(child);
            }
        }
        System.out.println(".");
    }
    public static void levelorderLinearwise(Node root){
        Queue<Node> queue = new ArrayDeque<Node>();
        Queue<Node> cqueue = new ArrayDeque<Node>();

        queue.add(root);
        while(queue.size() > 0){
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child : temp.Children){
                cqueue.add(child);
            }

            if(queue.size() == 0){
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println(".");
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        Node rootc1 = new Node(20);
        root.Children.add(rootc1);

        Node rootc2 = new Node(30);
        root.Children.add(rootc2);

        Node rootc3 = new Node(40);
        root.Children.add(rootc3);

        Node fifty = new Node(50);
        rootc1.Children.add(fifty);

        Node sixty = new Node(60);
        rootc1.Children.add(sixty);

        Node seventy = new Node(70);
        rootc2.Children.add(seventy);

        Node eighty = new Node(80);
        rootc2.Children.add(eighty);

        Node ninety = new Node(90);
        rootc2.Children.add(ninety);

        Node hundred = new Node(100);
        rootc3.Children.add(hundred);

        Node hundredten = new Node(110);
        eighty.Children.add(hundredten);

        Node hundredtwenty = new Node(120);
        eighty.Children.add(hundredtwenty);

        levelorder(root);
        levelorderLinearwise(root);
    }
}