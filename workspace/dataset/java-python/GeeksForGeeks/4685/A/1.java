

// Java implementation of the above approach 
import java.util.Vector; 
  
class GFG  
{ 
    // Function to generate a permutation  
    // of integers from 1 to N such that the  
    // absolute difference of all the two  
    // consecutive integers give K distinct integers 
    static void printPermutation(int N, int K)  
    { 
        // To store the permutation 
        Vector<Integer> res = new Vector<>(); 
  
        int l = 1, r = N, flag = 0; 
  
        for (int i = 0; i < K; i++) 
        { 
            if (flag == 0)  
            { 
                // For sequence 1 2 3... 
                res.add(l); 
                l++; 
            }  
            else 
            { 
                // For sequence N, N-1, N-2... 
                res.add(r); 
                r--; 
            } 
  
            // Flag is used to alternate between 
            // the above if else statements 
            flag ^= 1; 
        } 
  
        // Taking integers with difference 1 
        // If last element added was r + 1 
        if (flag != 1)  
        { 
            for (int i = r; i >= l; i--)  
            { 
                res.add(i); 
            } 
        }  
        // If last element added was l - 1 
        else 
        { 
            for (int i = l; i <= r; i++)  
            { 
                res.add(i); 
            } 
        } 
  
        // Print the permutation 
        for (Integer i : res)  
        { 
            System.out.print(i + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 10, K = 4; 
        printPermutation(N, K); 
          
    } 
} 
  
// This code is contributed by 
// 29AjayKumar  

