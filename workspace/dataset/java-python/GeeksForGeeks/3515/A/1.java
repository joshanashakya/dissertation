

// JAVA code for Longest Palindromic subString  
// using Palindromic Tree data structure  
class GFG  
{ 
  
    static final int MAXN = 1000; 
  
    static class Node 
    { 
        // store start and end indexes of current 
        // Node inclusively 
        int start, end; 
  
        // stores length of subString 
        int length; 
  
        // stores insertion Node for all characters a-z 
        int[] insertionEdge = new int[26]; 
  
        // stores the Maximum Palindromic Suffix Node for 
        // the current Node 
        int suffixEdge; 
    }; 
  
    // two special dummy Nodes as explained above 
    static Node root1, root2; 
  
    // stores Node information for constant time access 
    static Node[] tree = new Node[MAXN]; 
  
    // Keeps track the current Node while insertion 
    static int currNode; 
    static char[] s; 
    static int ptr; 
  
    // Function to insert edge in tree 
    static void insert(int currIndex) 
    { 
        // Finding X, such that s[currIndex] 
        // + X + s[currIndex] is palindrome. 
        int temp = currNode; 
  
        while (true) { 
            int currLength = tree[temp].length; 
            if (currIndex - currLength >= 1 &&  
                (s[currIndex] == s[currIndex - currLength - 1])) 
                break; 
  
            temp = tree[temp].suffixEdge; 
        } 
  
        // Check if s[currIndex] + X + 
        // s[currIndex] is already Present in tree. 
        if (tree[temp].insertionEdge[s[currIndex] - 'a'] != 0) 
        { 
            currNode = tree[temp].insertionEdge[s[currIndex] - 'a']; 
  
            return; 
        } 
  
        // Else Create new node; 
        ptr++; 
  
        tree[temp].insertionEdge[s[currIndex] - 'a'] = ptr; 
  
        tree[ptr].end = currIndex; 
  
        tree[ptr].length = tree[temp].length + 2; 
  
        tree[ptr].start = tree[ptr].end - tree[ptr].length + 1; 
  
        // Setting suffix edge for newly Created Node. 
  
        currNode = ptr; 
        temp = tree[temp].suffixEdge; 
  
        // Longest Palindromic suffix for a 
        // String of length 1 is a Null String. 
        if (tree[currNode].length == 1) 
        { 
            tree[currNode].suffixEdge = 2; 
            return; 
        } 
  
        // Else 
        while (true) 
        { 
            int currLength = tree[temp].length; 
  
            if (currIndex - currLength >= 1 &&  
                (s[currIndex] == s[currIndex - currLength - 1])) 
                break; 
  
            temp = tree[temp].suffixEdge; 
        } 
  
        tree[currNode].suffixEdge =  
        tree[temp].insertionEdge[s[currIndex] - 'a']; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        // Imaginary root's suffix edge points to 
        // itself, since for an imaginary String 
        // of length = -1 has an imaginary suffix 
        // String. Imaginary root. 
        root1 = new Node(); 
        root1.length = -1; 
        root1.suffixEdge = 1; 
  
        // null root's suffix edge points to 
        // Imaginary root, since for a String 
        // of length = 0 has an imaginary suffix String. 
        root2 = new Node(); 
        root2.length = 0; 
        root2.suffixEdge = 1; 
        for (int i = 0; i < MAXN; i++) 
            tree[i] = new Node(); 
        tree[1] = root1; 
        tree[2] = root2; 
  
        ptr = 2; 
        currNode = 1; 
        s = "forgeeksskeegfor".toCharArray(); 
        for (int i = 0; i < s.length; i++) 
            insert(i); 
  
        // last will be the index of our last subString 
        int last = ptr; 
  
        for (int i = tree[last].start; i <= tree[last].end; i++) 
            System.out.print(s[i]); 
  
    } 
} 
  
// This code is contributed by Rajput-Ji 

