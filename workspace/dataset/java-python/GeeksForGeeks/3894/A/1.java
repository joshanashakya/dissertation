

/* Given a node as prev_node, insert a new node after the given node */
public void InsertAfter(Node prev_Node, int new_data) 
{ 
  
    /*1. check if the given prev_node is NULL */
    if (prev_Node == null) { 
        System.out.println("The given previous node cannot be NULL "); 
        return; 
    } 
  
    /* 2. allocate node  
    * 3. put in the data */
    Node new_node = new Node(new_data); 
  
    /* 4. Make next of new node as next of prev_node */
    new_node.next = prev_Node.next; 
  
    /* 5. Make the next of prev_node as new_node */
    prev_Node.next = new_node; 
  
    /* 6. Make prev_node as previous of new_node */
    new_node.prev = prev_Node; 
  
    /* 7. Change previous of new_node's next node */
    if (new_node.next != null) 
        new_node.next.prev = new_node; 
} 

