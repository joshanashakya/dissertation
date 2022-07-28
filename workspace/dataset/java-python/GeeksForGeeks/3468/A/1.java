

// Java program to print level order traversal  
// in spiral form using one deque.  
import java.util.*;  
  
class GFG 
{ 
      
static class Node  
{  
    int data;  
    Node left, right;  
    Node(int val)  
    {  
        data = val;  
        left = null;  
        right = null;  
    }  
};  
  
static void spiralOrder(Node root)  
{  
  
    Deque<Node> d = new LinkedList<Node>();  
  
    // Push root  
    d.addLast(root);  
  
    // Direction 0 shows print right to left  
    // and for Direction 1 left to right  
    int dir = 0;  
    while (d.size() > 0)  
    {  
        int size = d.size();  
        while (size-->0) 
        {  
            // One whole level  
            // will be print in this loop  
  
            if (dir == 0)  
            {  
                Node temp = d.peekLast();  
                d.pollLast();  
                if (temp.right != null)  
                    d.addFirst(temp.right);  
                if (temp.left != null)  
                    d.addFirst(temp.left);  
                System.out.print(temp.data + " ");  
            }  
            else 
            {  
                Node temp = d.peekFirst(); 
                d.pollFirst();  
                if (temp.left != null)  
                    d.addLast(temp.left);  
                if (temp.right != null)  
                    d.addLast(temp.right);  
                System.out.print(temp.data + " ");  
            }  
        } 
        System.out.println(); 
          
        // Direction change  
        dir = 1 - dir;  
    }  
} 
  
// Driver code 
public static void main(String args[])  
{  
    // Build the Tree  
    Node root = new Node(10);  
    root.left = new Node(20);  
    root.right = new Node(30);  
    root.left.left = new Node(40);  
    root.left.right = new Node(60);  
  
    // Call the Function  
    spiralOrder(root);  
}  
} 
  
// This code is contributed by Arnab Kundu 

