class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;
        Node current = head; 
        
        while (current != null) {
            count++; 
            current = current.next; 
        }
        
        return count % 2 == 0;
    }
}
