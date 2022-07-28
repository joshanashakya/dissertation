

// Java program to find maximum number by  
// swapping extreme bits. 
  
class GFG { 
  
    static int findMax(int num) { 
        byte size_of_int = 4; 
        int num_copy = num; 
  
        /* Traverse bits from both extremes */
        int j = size_of_int * 8 - 1; 
        int i = 0; 
        while (i < j) { 
  
            // Obtaining i-th and j-th bits  
            int m = (num_copy >> i) & 1; 
            int n = (num_copy >> j) & 1; 
  
            /* Swapping the bits if lesser significant  
        is greater than higher significant  
        bit and accordingly modifying the number */
            if (m > n) { 
                int x = (1 << i | 1 << j); 
                num = num ^ x; 
            } 
  
            i++; 
            j--; 
        } 
        return num; 
    } 
  
    // Driver code  
    static public void main(String[] args) { 
        int num = 4; 
        System.out.println(findMax(num)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

