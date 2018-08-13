/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNodeAdd {
    public static void main(String[] args) {
        ListNode list = new ListNode(5);
//        list.next = new ListNode(4);
//        list.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
//        list2.next = new ListNode(6);
//        list2.next.next = new ListNode(4);

        ListNodeAdd listadd = new ListNodeAdd();
        System.out.println(listadd.addTwoNumbers(list, list2).toString());
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while(p!=null || q!=null)
        {
            int a = p != null? p.val :0;
            int b = q != null? q.val :0;
            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            if(p != null) p = p.next;
            if(q != null) q = q.next;
            curr = curr.next;
        }
        if(carry > 0) curr.next = new ListNode(carry);
        return head.next;

    }
}

