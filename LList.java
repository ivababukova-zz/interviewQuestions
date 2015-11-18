
public class LList {

    private LLitem firsti;
    private int size;


    public LList () {
        this.firsti = null;
        this.size = 0;
    }
  
    public void insert(int d1) {
	    LLitem link = new LLitem(d1);
	    link.setNext(firsti);
	    firsti = link;
        this.size = size + 1;
    }

    public int removeFirst() {
        int val = firsti.getVal();
        LLitem i = firsti.getNext();
        firsti = i;
        size = size - 1;
        return val;
    }

    public int getSize () {
        return this.size;
    }

    public void print() {
        LLitem node = firsti;
        System.out.println(" **** ");
        while (node != null) {
            System.out.println("next: " + node.getVal());
            node = node.getNext();
        }
    }

    public boolean isEmpty() {
	    return firsti == null;
    }


    public LList flip () {

        if (size == 0) {
            return null;
        }
        
        LList flist = new LList();

        if (size == 1) {
            flist.insert(firsti.getVal());
            return flist;
        }

        int[] vals = new int[size];
        LLitem node = firsti;
        int i = 0;
        while (i < size) {
            vals[i] = node.getVal();
            node = node.getNext();
            i ++;
        }
        i = 0;
        while (i < size) {
            flist.insert(vals[i]);
            i ++;
        }
        return flist;
    }

    public static void main(String[] args) {

        LList list = new LList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        int removed = list.removeFirst();
        System.out.println("removed: " + removed);
        list.insert(4);
        list.insert(5);
        list.print();
        LList flist = list.flip();
        System.out.println("flipped: ");
        flist.print();
    }

} 









