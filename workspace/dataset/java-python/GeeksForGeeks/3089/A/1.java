

// Java implementation of the algorithm 
/* A binary tree node has data, pointer to left child  
and a pointer to right child */
import java.util.*; 
  
// Class Node has data and references to the left  
// and the right child. 
class Node { 
    int data; 
    Node left, right; 
  
    Node(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
} 
  
class BinaryTree { 
  
    // Function that creates the tree 
    Node constructTreeUtil(int post[], int n) 
    { 
        // Last node is root 
        Node root = new Node(post[n - 1]); 
        Stack<Node> s = new Stack<>(); 
        s.push(root); 
  
        // Traverse from second last node 
        for (int i = n - 2; i >= 0; --i) { 
              
            Node x = new Node(post[i]); 
  
            // Keep popping nodes while top() of stack 
            // is greater. 
            Node temp = null; 
            while (!s.isEmpty() && post[i] < s.peek().data)  
                temp = s.pop();       
  
            // Make x as left child of temp    
            if (temp != null)  
                temp.left = x;       
  
            // Else make x as right of top       
            else
                s.peek().right = x; 
            s.push(x); 
        } 
        return root; 
    } 
  
    // Function that calls the method which contructs the tree 
    Node constructTree(int post[], int size) 
    { 
        return constructTreeUtil(post, size); 
    } 
  
    // A utility function to print inorder traversal  
    // of a Binary Tree 
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        int post[] = new int[] { 1, 7, 5, 50, 40, 10 }; 
        int size = post.length; 
  
        Node root = tree.constructTree(post, size); 
  
        System.out.println("Inorder traversal of the constructed tree:"); 
        tree.printInorder(root); 
    } 
} 

