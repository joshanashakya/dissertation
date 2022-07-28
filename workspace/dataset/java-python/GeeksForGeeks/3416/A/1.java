

// Java program to print paths with maximum 
// element in the path greater than K 
import java.util.*; 
  
class GFG 
{ 
  
// A Binary Tree node 
static class Node  
{ 
    int data; 
    Node left, right; 
}; 
static int ans; 
  
// A utility function to create a new node 
static Node newNode(int data) 
{ 
    Node newNode = new Node(); 
    newNode.data = data; 
    newNode.left = newNode.right = null; 
    return (newNode); 
} 
  
// A recursive function to print the paths 
// whose maximum element is greater than 
// or equal to K. 
static void findPathUtil(Node root, int k, 
                Vector<Integer> path, 
                int flag) 
{ 
    if (root == null) 
        return; 
  
    // If the current node value is greater than 
    // or equal to k, then all the subtrees 
    // following that node will get printed, 
    // flag = 1 indicates to print the required path 
    if (root.data >= k) 
        flag = 1; 
  
    // If the leaf node is encountered, then the path is 
    // printed if the size of the path vector is 
    // greater than 0 
    if (root.left == null && root.right == null) 
    { 
        if (flag == 1)  
        { 
            ans = 1; 
            System.out.print("("); 
            for (int i = 0; i < path.size(); i++) 
            { 
                System.out.print(path.get(i)+ ", "); 
            } 
            System.out.print(root.data+ "), "); 
        } 
        return; 
    } 
  
    // Append the node to the path vector 
    path.add(root.data); 
  
    // Recur left and right subtrees 
    findPathUtil(root.left, k, path, flag); 
    findPathUtil(root.right, k, path, flag); 
  
    // Backtracking to return the vector 
    // and print the path if the flag is 1 
    path.remove(path.size()-1); 
} 
  
// Function to initialize the variables 
// and call the utility function to print 
// the paths with maximum values greater than 
// or equal to K 
static void findPath(Node root, int k) 
{ 
    // Initialize flag 
    int flag = 0; 
  
    // ans is used to check empty condition 
    ans = 0; 
  
    Vector<Integer> v = new Vector<Integer>(); 
  
    // Call function that print path 
    findPathUtil(root, k, v, flag); 
  
    // If the path doesn't exist 
    if (ans == 0) 
        System.out.print("-1"); 
} 
  
// Driver code 
public static void main(String [] args) 
{ 
    int K = 25; 
  
    /* Constructing the following tree: 
                10 
            / \ 
            5     8 
        / \ / \ 
        29 2 1 98 
        /             \      
        20             50 
*/
  
    Node root = newNode(10); 
    root.left = newNode(5); 
    root.right = newNode(8); 
    root.left.left = newNode(29); 
    root.left.right = newNode(2); 
    root.right.right = newNode(98); 
    root.right.left = newNode(1); 
    root.right.right.right = newNode(50); 
    root.left.left.left = newNode(20); 
  
    findPath(root, K); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

