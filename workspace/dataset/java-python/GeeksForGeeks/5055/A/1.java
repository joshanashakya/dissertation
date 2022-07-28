

// Java implementation to print maximum element  
// among all right child nodes 
import java.io.*;  
import java.util.*; 
  
// User defined node class 
class Node { 
      int data; 
      Node left, right; 
      // Constructor to create a new tree node 
      Node(int key) 
      { 
           data = key; 
           left = right = null; 
      } 
} 
class GFG { 
      static int maxOfRightElement(Node root) 
      { 
             // Temp variable 
             int res = Integer.MIN_VALUE; 
  
             // If tree is empty  
             if (root == null) 
                 return -1; 
               
              // If right child exists 
              if (root.right != null) 
                  res = root.right.data; 
  
              // Return maximum of three values  
              // 1) Recursive max in right subtree 
              // 2) Value in right child node  
              // 3) Recursive max in left subtree 
              return Math.max(maxOfRightElement(root.right), 
                     Math.max(res,maxOfRightElement(root.left))); 
      } 
      // Driver code 
      public static void main(String args[]) 
      { 
           // Create binary tree 
          // as shown below 
  
          /*   7 
              / \ 
             6   5 
            / \ / \ 
            4 3 2  1  */ 
       
          Node root = new Node(7); 
          root.left = new Node(6); 
          root.right = new Node(5); 
          root.left.left = new Node(4); 
          root.left.right = new Node(3); 
          root.right.left = new Node(2); 
          root.right.right = new Node(1); 
   
          System.out.println(maxOfRightElement(root)); 
       } 
} 
// This code is contibuted by rachana soma  

