

// java program to print the Leftover 
// element after performing alternate 
// Bitwise OR and Bitwise XOR operations 
// to the pairs. 
import java .io.*; 
  
public class GFG { 
  
    static int N = 1000; 
      
    // array to store the tree 
    static int []tree = new int[N]; 
      
    // array to store the level of 
    // every parent 
    static int []level = new int[N]; 
      
    // fucntion to construct the tree 
    static void constructTree(int low, int high, 
                               int pos, int []a) 
    { 
        if (low == high) 
        { 
              
            // level of child is 
            // always 0 
            level[pos] = 0; 
            tree[pos] = a[high]; 
            return; 
        } 
        int mid = (low + high) / 2; 
      
        // recursive call 
        constructTree(low, mid, 2 * pos + 1, a); 
          
        constructTree(mid + 1, high,  
                                2 * pos + 2, a); 
      
        // increase the level of every parent, 
        // which is level of child + 1 
        level[pos] = level[2 * pos + 1] + 1; 
      
        // if the parent is at odd level, then 
        // do a bitwise OR 
        if ((level[pos] & 1) > 0) 
            tree[pos] = tree[2 * pos + 1] | 
                              tree[2 * pos + 2]; 
      
        // if the parent is at even level, then 
        // do a bitwise XOR 
        else
            tree[pos] = tree[2 * pos + 1] ^  
                              tree[2 * pos + 2]; 
    } 
      
    // fucntion that updates the tree 
    static void update(int low, int high, int pos, 
                               int index, int []a) 
    { 
          
        // if it is a leaf and the leaf which is  
        // to be updated 
        if (low == high && low == index) 
        { 
            tree[pos] = a[low]; 
            return; 
        } 
      
        // out of range 
        if (index < low || index > high) 
            return; 
      
        // not a leaf then recurse 
        if (low != high) 
        { 
            int mid = (low + high) / 2; 
      
            // recursive call 
            update(low, mid, 2 * pos + 1, index, a); 
              
            update(mid + 1, high, 2 * pos + 2, 
                                          index, a); 
      
            // check if the parent is at odd or 
            // even level and perform OR or XOR 
            // according to that 
            if ((level[pos] & 1) > 0) 
                tree[pos] = tree[2 * pos + 1] | 
                                  tree[2 * pos + 2]; 
            else
                tree[pos] = tree[2 * pos + 1] ^ 
                                  tree[2 * pos + 2]; 
        } 
    } 
      
    // fucntion that assigns value to a[index] 
    // and calls update function to update the 
    // tree 
    static void updateValue(int index, int value, 
                                   int []a, int n) 
    { 
        a[index] = value; 
        update(0, n - 1, 0, index, a); 
    } 
      
    // Driver Code 
    static public void main (String[] args) 
    { 
        int []a = { 1, 4, 5, 6 }; 
        int n = a.length;; 
      
        // builds the tree 
        constructTree(0, n - 1, 0, a); 
      
        // 1st query 
        int index = 0; 
        int value = 2; 
        updateValue(index, value, a, n); 
        System.out.println(tree[0]); 
      
        // 2nd query 
        index = 3; 
        value = 5; 
        updateValue(index, value, a, n); 
        System.out.println(tree[0]); 
    } 
} 
  
// This code is contributed by vt_m. 

