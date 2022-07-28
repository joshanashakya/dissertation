

// Java implementation of the approach 
class GFG 
{ 
  
// Structure for the node 
// of the linked list 
static class node 
{ 
    char data; 
    node next; 
}; 
  
// Utility function to add a new 
// node to the linked list 
static node add(char data) 
{ 
    node newnode = new node(); 
  
    // Assign the data to the data part 
    // and assign null to the address part 
    newnode.data = data; 
    newnode.next = null; 
    return newnode; 
} 
  
// Function to print the linked list 
static void print(node head) 
{ 
    while (head != null)  
    { 
        System.out.print(head.data + " -> "); 
        head = head.next; 
    } 
    System.out.print("null"); 
} 
  
// Function that returns true if 
// ch is a special character 
static boolean isSpecialChar(char ch) 
{ 
  
    // If lower-case character 
    if (ch >= 'a' && ch <= 'z') 
        return false; 
  
    // If upper-case character 
    if (ch >= 'A' && ch <= 'Z') 
        return false; 
  
    // If digit 
    if (ch >= '0' && ch <= '9') 
        return false; 
  
    // ch is a special character 
    return true; 
} 
  
// Function to remove the special 
// characters from the linked list 
static node removeFromLL(node head) 
{ 
  
    // Declare two variables curr and 
    // prev both pointing to head 
    node curr = head; node prev = head; 
  
    // The following loop removes special 
    // characters from the head of the linked list 
    // In case the special character is present at 
    // the head of the linked list, make head point 
    // to the next valid character 
    while (curr != null &&  
           isSpecialChar(curr.data))  
    { 
        node temp = curr; 
        head = curr.next; 
        curr = curr.next; 
        temp = null; 
    } 
  
    // Make prev point to head 
    prev = head; 
  
    // Repeat the process for 
    // the entire Linked list 
    while (curr != null) 
    { 
  
        // Repeat the process for all the elements 
        // of linked list, in case a special character 
        // is encountered then make the previous valid 
        // character point to the next valid character 
        // and remove the current node from the linked list 
        while (curr != null && 
               isSpecialChar(curr.data)) 
        { 
            node temp = curr; 
            prev.next = curr.next; 
            curr = curr.next; 
            temp = null; 
        } 
  
        // If the end is reached 
        if (curr == null) 
            break; 
        prev = curr; 
        curr = curr.next; 
    } 
    return head; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Create the linked list 
    node head = null; 
    head = add('('); 
    head.next = add('G'); 
    head.next.next = add('E'); 
    head.next.next.next = add('E'); 
    head.next.next.next.next = add('*'); 
    head.next.next.next.next.next = add('K'); 
    head.next.next.next.next.next.next = add('S'); 
    head.next.next.next.next.next.next.next = add('*'); 
  
    // Remove the special characters 
    // from the linked list 
    head = removeFromLL(head); 
  
    // Print the updated list 
    print(head); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

