

public class LLitem {

    private int val;
    private LLitem next;

    public void setValue (int newval) {
        this.val = newval;
    }

    public void setNext (LLitem item) {
        this.next = item;
    }

    public LLitem (int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal () {
        return this.val;
    }

    public LLitem getNext () {
        return this.next;
    }

}
