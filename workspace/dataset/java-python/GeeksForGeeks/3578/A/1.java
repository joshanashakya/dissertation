

// Java implementation of the approach 
class GFG 
{ 
  
// Singly Linked List structure 
static class node 
{ 
    int data; 
    node next; 
} 
  
// Function to add a new node 
// to the Linked List 
static node add(int data) 
{ 
    node newnode = new node(); 
    newnode.data = data; 
    newnode.next = null; 
    return newnode; 
} 
  
// Function to print the array contents 
static void printArr(int a[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(a[i]+" "); 
} 
  
// Function to return the length 
// of the Linked List 
static int findlength(node head) 
{ 
    node curr = head; 
    int cnt = 0; 
    while (curr != null) 
    { 
        cnt++; 
        curr = curr.next; 
    } 
    return cnt; 
} 
  
// Function to convert the 
// Linked List to an array 
static void convertArr(node head) 
{ 
  
    // Find the length of the 
    // given linked list 
    int len = findlength(head); 
  
    // Create an array of the 
    // required length 
    int []arr = new int[len]; 
  
    int index = 0; 
    node curr = head; 
  
    // Traverse the Linked List and add the 
    // elements to the array one by one 
    while (curr != null)  
    { 
        arr[index++] = curr.data; 
        curr = curr.next; 
    } 
  
    // Print the created array 
    printArr(arr, len); 
} 
  
// Driver code  
public static void main(String []args) 
{ 
    node head = new node(); 
    head = add(1); 
    head.next = add(2); 
    head.next.next = add(3); 
    head.next.next.next = add(4); 
    head.next.next.next.next = add(5); 
  
    convertArr(head); 
} 
} 
  
// This code is contributed by Rajput-Ji 

