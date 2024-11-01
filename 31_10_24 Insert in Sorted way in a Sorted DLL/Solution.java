class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newNode = new Node(x);
        
        if (head == null) {
            return newNode;
        }
        
        if (x < head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }
        
        newNode.next = current.next;
        newNode.prev = current;
        
        if (current.next != null) {
            current.next.prev = newNode;
        }
        
        current.next = newNode;
        
        return head;
    }
}