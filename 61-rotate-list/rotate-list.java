/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int[] array = convertToArray(head);
        System.out.println(Arrays.toString(array));
        int[] a = new int[array.length];
        for (int i=0;i<array.length ;i++ ) {
        	a[(i+k)% array.length]=array[i];
        }
        // System.out.println(Arrays.toString(a));
        ListNode rt = convertToListNode(a);
        return rt;
    }

    public static int[] convertToArray(ListNode head) {
       List<Integer> list = new ArrayList<>();
       while (head != null) {
           list.add(head.val);
           head = head.next;
       }
       return list.stream().mapToInt(i -> i).toArray(); // Convert List<Integer> to int[]
    }

    public static ListNode convertToListNode(int[] arr) {
        if (arr.length == 0) return null;

        ListNode dummy = new ListNode(0); // Temporary dummy node
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next; // Return the actual head
    }
}