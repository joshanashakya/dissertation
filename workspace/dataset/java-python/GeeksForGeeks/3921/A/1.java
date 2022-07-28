

// Java implementation of the above approach 
class GFG 
{ 
  
    // A binary tree node 
    static class Node  
    { 
        int data; 
        Node left, right; 
    }; 
  
    static int res; 
  
    // A utility function to allocate a new node 
    static Node newNode(int data) 
    { 
        Node newNode = new Node(); 
        newNode.data = data; 
        newNode.left = newNode.right = null; 
        return (newNode); 
    } 
  
    // This function updates overall count of 1 in 'res' 
    // And returns count 1s going through root. 
    static int countUntil(Node root)  
    { 
        // Base Case 
        if (root == null) 
            return 0; 
  
        // l and r store count of 1s going through left and 
        // right child of root respectively 
        int l = countUntil(root.left); 
        int r = countUntil(root.right); 
  
        // maxCount represents the count of 1s when the Node under 
        // consideration is the root of the maxCount path and no 
        // ancestors of the root are there in maxCount path 
        int maxCount; 
  
        // if the value at node is 1 then its 
        // count will be considered 
        // including the leftCount and the rightCount 
        if (root.data == 1) 
            maxCount = l + r + 1; 
        else
            maxCount = l + r; 
  
        // Store the Maximum Result. 
        res = Math.max(res, maxCount); 
  
        // return max count in a single path. 
        // This path must include at-most one child 
        // of the root as well as itself 
  
        // if the value at node is 1 
        // then its count will be considered 
        // including the maximum of leftCount or the rightCount 
        if (root.data == 1) 
            return Math.max(l, r) + 1; 
        else
            return Math.max(l, r); 
    } 
  
    // Returns maximum count of 1 in any path 
    // in tree with given root 
    static int findMaxCount(Node root)  
    { 
        // Initialize result 
        res = Integer.MIN_VALUE; 
  
        // Compute and return result 
        countUntil(root); 
        return res; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        Node root = newNode(1); 
        root.left = newNode(0); 
        root.right = newNode(1); 
        root.left.left = newNode(1); 
        root.left.right = newNode(1); 
        root.left.right.left = newNode(1); 
        root.left.right.right = newNode(0); 
        System.out.print(findMaxCount(root)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

