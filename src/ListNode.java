import java.util.List;

public class ListNode {
    public int val;
    ListNode next;

    public ListNode(int val) {
        super();
        this.val = val;
    }

    @Override
    public String toString() {
        if (next != null)
            return next.toString()+""+this.val;
        else
            return this.val+"";
    }
}
