

// Java program to count the numbers divisible 
// by k in a given range 
  
class GFG { 
  
// Returns count of numbers in [l r] that 
// are divisible by k. 
    static boolean Check_is_possible(int l, int r, int k) { 
        int div_count = (r / k) - (l / k); 
  
        // Add 1 explicitly as l is divisible by k 
        if (l % k == 0) { 
            div_count++; 
        } 
  
        // l is not divisible by k 
        return (div_count > 1); 
    } 
  
// Driver Code 
    public static void main(String[] args) { 
        int l = 30, r = 70, k = 10; 
        if (Check_is_possible(l, r, k)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

