class GfG {
    
    public static Node quickSort(Node head) {
        return quickSortRecur(head, getTail(head));
    }

    private static Node getTail(Node node) {
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    private static Node quickSortRecur(Node head, Node end) {
        if (head == null || head == end) return head;
        
        Node[] newHead = new Node[1];
        Node[] newEnd = new Node[1];

        Node pivot = partition(head, end, newHead, newEnd);
        
        if (newHead[0] != pivot) {
            Node temp = newHead[0];
            while (temp.next != pivot) temp = temp.next;
            temp.next = null;
            
            newHead[0] = quickSortRecur(newHead[0], temp);
            
            temp = getTail(newHead[0]);
            temp.next = pivot;
        }
        

        pivot.next = quickSortRecur(pivot.next, newEnd[0]);
        
        return newHead[0];
    }

    private static Node partition(Node head, Node end, Node[] newHead, Node[] newEnd) {
        Node pivot = end;
        Node curr = head, prev = null, tail = pivot;
        
        while (curr != pivot) {
            if (curr.data < pivot.data) {
                if (newHead[0] == null) newHead[0] = curr;
                prev = curr;
                curr = curr.next;
            } else {
                if (prev != null) prev.next = curr.next;
                Node temp = curr.next;
                curr.next = null;
                tail.next = curr;
                tail = curr;
                curr = temp;
            }
        }
        
        if (newHead[0] == null) newHead[0] = pivot;
        newEnd[0] = tail;
        
        return pivot;
    }
}