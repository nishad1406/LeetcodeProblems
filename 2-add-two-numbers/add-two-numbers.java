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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String add1=stacking(l1);
        String add2= stacking(l2);
        
        String mod = (add1.length() == add2.length()) ? add1 : (add1.length() > add2.length() ? 
        											padString(add2, add1.length()) : padString(add1, add2.length()));
        System.out.println(mod+" mmmoo");
    	String op = addition(add1, add2);
    	
    	ListNode rt = intToList(op);
		return rt;
    }

    private static String stacking(ListNode current){
    	Stack<String> stack = new Stack<>();
		StringBuilder bldr= new StringBuilder();
		while (current != null) {
		    stack.push(current.val+""); // Push values into stack
		    current = current.next;
		}
		while (!stack.isEmpty()) {
		    bldr = bldr.append(stack.pop());
		}
		// System.out.println(bldr+ "Strsssss");
		// System.out.println();
		return bldr.toString();
    }


    public static String padString(String original, int targetLength) {
    	StringBuilder sb = new StringBuilder();
    
    	while (sb.length() + original.length() < targetLength) {
        	sb.append('0'); // Add leading zeros
    	}
    
    	sb.append(original); // Append the actual string
    	return sb.toString(); // Convert to String
	}

    public static String addition(String num1, String num2){
    	StringBuilder result = new StringBuilder();
    	int i = num1.length() - 1;  
    	int j = num2.length() - 1;  
    	int carry = 0;
	
    	while (i >= 0 || j >= 0 || carry > 0) {
    	    int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0; 
    	    int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0; 
    	    
    	    int sum = digit1 + digit2 + carry;  
    	    carry = sum / 10;                   
    	    result.append(sum % 10);            
    	    
    	    i--; j--;  
    	}
    	// System.out.println(result+" sb");
    	return result.toString();

    }

    private static ListNode intToList(String num){
    	
    	if (num.equals("0")) return new ListNode(0); 
    	ListNode dummy = new ListNode(0);
    	ListNode current = dummy;
	
    	for (char c : num.toCharArray()) { 
    	    current.next = new ListNode(c - '0'); // Convert char to integer
    	    current = current.next;
    	}
	
    	return dummy.next; 
    }

    
}