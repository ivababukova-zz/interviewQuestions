

public class Node {

    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public Node addNode (int val) {
        this.next = new Node(val);
        return this.next;
    } 

    public void flip () {
        Node prev = this;
        Node curr = this.next;
        Node next;
        prev.next = null;
        while (curr != null ) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public void print () {
        System.out.println(val);
        Node curr = next;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tail = head.addNode(2);
        tail = tail.addNode(3);
        tail = tail.addNode(4);
        head.print();
        head.flip();
        System.out.println("****");
        tail.print();
    }

}
