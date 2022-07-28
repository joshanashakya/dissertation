

    
// Java implementation of the approach 
import java.util.*; 
class solution 
{ 
  
/* A Binary Tree node */
 static  class TNode { 
    int data; 
     TNode left; 
     TNode right; 
} 
  
  
/* Function to con AVL tree  
   from a sorted array */
 static TNode sortedArrayToBST(int arr[], int start, int end) 
{ 
    /* Base Case */
    if (start > end) 
        return null; 
  
    /* Get the middle element  
       and make it root */
    int mid = (start + end) / 2; 
     TNode root = newNode(arr[mid]); 
  
    /* Recursively con the  
       left subtree and make it  
       left child of root */
    root.left = sortedArrayToBST(arr, start, mid - 1); 
  
    /* Recursively con the  
       right subtree and make it  
       right child of root */
    root.right = sortedArrayToBST(arr, mid + 1, end); 
  
    return root; 
} 
  
/* Helper function that allocates 
   a new node with the given data  
   and null to the left and  
   the right pointers. */
static  TNode newNode(int data) 
{ 
     TNode node = new TNode(); 
    node.data = data; 
    node.left = null; 
    node.right = null; 
  
    return node; 
} 
  
// This function is used for testing purpose 
static void printLevelOrder(TNode root)  
{  
    if (root == null)  return;  
  
    Queue<TNode > q= new LinkedList<TNode>();  
    q.add(root);  
    
    while (q.size()>0)  
    {  
        TNode node = q.element();  
        System.out.print( node.data + " ");  
        q.remove();  
        if (node.left != null)  
            q.add(node.left);  
        if (node.right != null)  
            q.add(node.right);  
    }  
}    
  
/* Driver program to  
test above functions */
public static void main(String args[]) 
{ 
  
    // Assuming the array is sorted 
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
    int n = arr.length; 
  
    /* Convert List to AVL tree */
     TNode root = sortedArrayToBST(arr, 0, n - 1); 
    printLevelOrder(root); 
  
} 
} 
//contributed by Arnab Kundu 

