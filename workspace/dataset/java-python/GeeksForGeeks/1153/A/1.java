

// Java program for the above approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Structure Representing 
    // the Node in the Binary tree 
    static class Node  
    { 
        char data; 
        Node left, right; 
  
        Node(char _val)  
        { 
            data = _val; 
            left = right = null; 
        } 
    }; 
  
    // Function to perform a level 
    // order insertion of a new Node 
    // in the Binary tree 
    static Node addinBT(Node root,  
                        char data) 
    { 
        // If the root is empty, 
        // make it point to the new Node 
        if (root == null)  
        { 
            root = new Node(data); 
        }  
        else 
        { 
  
            // In case there are elements 
            // in the Binary tree, perform 
            // a level order traversal 
            // using a Queue 
            Queue<Node> Q = new LinkedList<Node>(); 
            Q.add(root); 
  
            while (!Q.isEmpty())  
            { 
                Node temp = Q.peek(); 
                Q.remove(); 
                  
                // If the left child does 
                // not exist, insert the 
                // new Node as the left child 
                if (temp.left == null)  
                { 
                    temp.left = new Node(data); 
                    break; 
                }  
                else
                    Q.add(temp.left); 
                      
                // In case the right child 
                // does not exist, insert 
                // the new Node as the right child 
                if (temp.right == null)  
                { 
                    temp.right = new Node(data); 
                    break; 
                }  
                else
                    Q.add(temp.right); 
            } 
        } 
        return root; 
    } 
  
    // Function to print the level 
    // order traversal of the Binary tree 
    static void print(Node root)  
    { 
        Queue<Node> Q = new LinkedList<Node>(); 
        Q.add(root); 
  
        while (Q.size() > 0) 
        { 
            Node temp = Q.peek(); 
            Q.remove(); 
            System.out.print(temp.data); 
            if (temp.left != null) 
                Q.add(temp.left); 
            if (temp.right != null) 
                Q.add(temp.right); 
        } 
    } 
  
    // Function to check if the 
    // character is a vowel or not. 
    static boolean checkvowel(char ch) 
    { 
        ch = Character.toLowerCase(ch); 
        if (ch == 'a' || ch == 'e' ||  
            ch == 'i' || ch == 'o' ||  
            ch == 'u') 
        { 
            return true; 
        }  
        else 
        { 
            return false; 
        } 
    } 
  
    // Function to remove the 
    // vowels in the new Binary tree 
    static Node removevowels(Node root) 
    { 
        Queue<Node> Q = new LinkedList<Node>(); 
        Q.add(root); 
          
        // Declaring the root of 
        // the new tree 
        Node root1 = null; 
  
        while (!Q.isEmpty()) 
        { 
            Node temp = Q.peek(); 
            Q.remove(); 
              
            // If the given character 
            // is not a vowel, add it 
            // to the new Binary tree 
            if (!checkvowel(temp.data))  
            { 
                root1 = addinBT(root1, temp.data); 
            } 
            if (temp.left != null) 
            { 
                Q.add(temp.left); 
            } 
            if (temp.right != null)  
            { 
                Q.add(temp.right); 
            } 
        } 
        return root1; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "geeks"; 
        Node root = null; 
  
        for (int i = 0; i < s.length(); i++) 
        { 
            root = addinBT(root, s.charAt(i)); 
        } 
  
        root = removevowels(root); 
        print(root); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

