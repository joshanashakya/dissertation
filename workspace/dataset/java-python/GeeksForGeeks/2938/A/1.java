

// Java implementation of the approach  
  
class GFG { 
  
// Function to return the greatest divisor that  
// divides all the natural numbers in the range [l, r]  
    static int find_greatest_divisor(int l, int r) { 
        if (l == r) { 
            return l; 
        } 
  
        return 1; 
    } 
  
// Driver Code  
    public static void main(String[] args) { 
        int l = 2, r = 12; 
  
        System.out.println(find_greatest_divisor(l, r)); 
    } 
} 
// This code is contributed by PrinciRaj1992 

