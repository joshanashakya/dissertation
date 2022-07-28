

// Java program to print level of given node  
// in binary tree iterative approach  
/* Example binary tree  
root is at level 1  
  
                20  
            / \  
            10 30  
        / \ / \  
        5 15 25 40  
            /  
            12 */
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
  
    // node of binary tree 
    static class node  
    { 
        int data; 
        node left, right; 
  
        node(int data) 
        { 
            this.data = data; 
            this.left = this.right = null; 
        } 
    } 
  
    // utility function to return level of given node 
    static int getLevel(node root, int data) 
    { 
        Queue<node> q = new LinkedList<>(); 
        int level = 1; 
        q.add(root); 
  
        // extra NULL is pushed to keep track 
        // of all the nodes to be pushed before 
        // level is incremented by 1 
        q.add(null); 
        while (!q.isEmpty()) 
        { 
            node temp = q.poll(); 
            if (temp == null) 
            { 
                if (q.peek() != null)  
                { 
                    q.add(null); 
                } 
                level += 1; 
            }  
            else
            { 
                if (temp.data == data)  
                { 
                    return level; 
                } 
                if (temp.left != null)  
                { 
                    q.add(temp.left); 
                } 
                if (temp.right != null)  
                { 
                    q.add(temp.right); 
                } 
            } 
        } 
        return 0; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        // create a binary tree 
        node root = new node(20); 
        root.left = new node(10); 
        root.right = new node(30); 
        root.left.left = new node(5); 
        root.left.right = new node(15); 
        root.left.right.left = new node(12); 
        root.right.left = new node(25); 
        root.right.right = new node(40); 
  
        // return level of node 
        int level = getLevel(root, 30); 
        if (level != 0) 
            System.out.println("level of node 30 is " + level); 
        else
            System.out.println("node 30 not found"); 
  
        level = getLevel(root, 12); 
        if (level != 0) 
            System.out.println("level of node 12 is " + level); 
        else
            System.out.println("node 12 not found"); 
  
        level = getLevel(root, 25); 
        if (level != 0) 
            System.out.println("level of node 25 is " + level); 
        else
            System.out.println("node 25 not found"); 
  
        level = getLevel(root, 27); 
        if (level != 0) 
            System.out.println("level of node 27 is " + level); 
        else
            System.out.println("node 27 not found"); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

