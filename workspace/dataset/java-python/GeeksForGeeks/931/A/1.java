

// Java program to reverse alternate k nodes in a linked list 
  
class LinkedList { 
  
    static Node head; 
  
    class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Alternatively reverses the given linked list in groups of  
     given size k. */
    Node kAltReverse(Node head, int k) { 
        return _kAltReverse(head, k, true); 
    } 
  
    /*  Helper function for kAltReverse().  It reverses k nodes of the list only if 
     the third parameter b is passed as true, otherwise moves the pointer k  
     nodes ahead and recursively calls iteself  */
    Node _kAltReverse(Node node, int k, boolean b) { 
        if (node == null) { 
            return null; 
        } 
  
        int count = 1; 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
  
        /* The loop serves two purposes 
         1) If b is true, then it reverses the k nodes  
         2) If b is false, then it moves the current pointer */
        while (current != null && count <= k) { 
            next = current.next; 
  
            /* Reverse the nodes only if b is true*/
            if (b == true) { 
                current.next = prev; 
            } 
  
            prev = current; 
            current = next; 
            count++; 
        } 
  
        /* 3) If b is true, then node is the kth node.  
         So attach rest of the list after node.  
         4) After attaching, return the new head */
        if (b == true) { 
            node.next = _kAltReverse(current, k, !b); 
            return prev; 
        } /* If b is not true, then attach rest of the list after prev.  
         So attach rest of the list after prev */ else { 
            prev.next = _kAltReverse(current, k, !b); 
            return node; 
        } 
    } 
  
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    void push(int newdata) { 
        Node mynode = new Node(newdata); 
        mynode.next = head; 
        head = mynode; 
    } 
  
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
  
        // Creating the linkedlist 
        for (int i = 20; i > 0; i--) { 
            list.push(i); 
        } 
        System.out.println("Given Linked List :"); 
        list.printList(head); 
        head = list.kAltReverse(head, 3); 
        System.out.println(""); 
        System.out.println("Modified Linked List :"); 
        list.printList(head); 
  
    } 
} 
  
// This code has been contributed by Mayank Jaiswal 

