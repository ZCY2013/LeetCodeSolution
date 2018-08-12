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
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNodeAdd listadd = new ListNodeAdd();
        listadd.addTwoNumbers(list, list2).toString();
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
}

