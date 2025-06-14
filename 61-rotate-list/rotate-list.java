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
      if(head==null || head.next == null) return head;
      int count=0;
      ListNode temp=head;
      while(temp!=null){
        count++;
        temp=temp.next;
      }
      for(int i=0;i<k%count;i++){
        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;
        while(next != null){
           prev=current;
           current=next;
           if(next!=null) next=next.next;
        }
          prev.next=null;
            current.next=head;
            head=current;
      }  
      return head;
    }
}