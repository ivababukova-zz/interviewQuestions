import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Skysanner {

    private static class Node {

        String name;
        Node root;
        boolean visited1;
        boolean visited2;

        Node(String name) {
            this.name = name;
            this.root = null;
            this.visited1 = false;
            this.visited2 = false;
        }    
    }
    
    static void bfs1(Node curr) {
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(curr);

            while (!queue.isEmpty()) {
                curr = queue.remove();
                if (!curr.visited1) {
                    curr.visited1 = true;
                    Node root = curr.root;
                    if (root != null) queue.add(root);
                }
            }
        }

    static void bfs2(Node curr) {
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(curr);

            while (!queue.isEmpty()) {
                curr = queue.remove();
                if (!curr.visited2) {
                    curr.visited2 = true;
                    if (curr.visited1) {
                        System.out.println(curr.name);
                        return;
                    }
                    Node root = curr.root;
                    if (root != null) queue.add(root);
                }
            }
        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Node n1 = new Node(sc.next());
        Node n2 = new Node(sc.next());
       
        HashMap<String, Node> allnodes = new HashMap<>();
        allnodes.put(n1.name, n1);
        allnodes.put(n2.name, n2);

        while (sc.hasNext()) {        
            String pair1 = sc.next();
            String pair2 = sc.next();
            Node manager;
            Node employee;
            System.out.println("pair: " + pair1 + " " + pair2);
            if (allnodes.get(pair1) != null) {
                manager = allnodes.get(pair1);
            }
            else {
                manager = new Node(pair1);
                allnodes.put(manager.name, manager);
            }
            if (allnodes.get(pair2) != null) {
                employee = allnodes.get(pair2);
            }
            else {
                employee = new Node(pair2);
                allnodes.put(employee.name, employee);
            }            
            employee.root = manager;
        }
        bfs1(n1);
        bfs2(n2);
    }

}
