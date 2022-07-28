

// JAVA Code for Queries on XOR 
// of XORs of all subarrays 
import java.util.*; 
  
class GFG { 
  
    // Output for each query 
    static void ansQueries(int prefeven[],  
                           int prefodd[], 
                           int l, int r)  
    { 
        // If number of element is even. 
        if ((r - l + 1) % 2 == 0) 
            System.out.println("0"); 
                                                                                                                                                                                                                                                                                  
        // If number of element is odd. 
        else
        { 
            // if l is even 
            if (l % 2 == 0) 
                System.out.println(prefeven[r] ^  
                                prefeven[l - 1]); 
              
            // if l is odd 
            else
                System.out.println(prefodd[r] ^  
                                 prefodd[l - 1]); 
        } 
    } 
      
    // Wrapper Function 
    static void wrapper(int arr[], int n,  
                        int l[], int r[], 
                                   int q)  
    { 
        int prefodd[] = new int[100]; 
        int prefeven[] = new int[100]; 
          
        // Evaluating prefixodd  
        // and prefixeven 
        for (int i = 1; i <= n; i++) { 
              
            if ((i) % 2 == 0) { 
                  
                prefeven[i] = arr[i - 1] ^  
                             prefeven[i - 1]; 
                  
                prefodd[i] = prefodd[i - 1]; 
            }  
            else
            { 
                prefeven[i] = prefeven[i - 1]; 
                prefodd[i] = prefodd[i - 1] ^ 
                             arr[i - 1]; 
            } 
        } 
          
        int i = 0; 
          
        while (i != q){ 
              
            ansQueries(prefeven, prefodd,  
                             l[i], r[i]); 
            i++; 
        } 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 4 , 5}; 
        int n = arr.length; 
          
        int l[] = {1, 1, 2}; 
        int r[] = {2, 3, 4}; 
        int q = l.length; 
          
        wrapper(arr, n, l, r, q); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

