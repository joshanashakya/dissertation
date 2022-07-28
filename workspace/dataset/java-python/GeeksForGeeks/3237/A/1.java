

// Java implementation to find K  
// odd positive integers such that 
// their sum is equal to given number 
import java.util.*; 
  
class GFG{ 
   
// Function to find K odd positive 
// integers such that their sum is N 
static void findDistinctOddSum(int n, int k) 
{ 
    // Condition to check if there 
    // are enough values to check 
    if ((k * k) <= n &&  
        (n + k) % 2 == 0){ 
        int val = 1; 
        int sum = 0; 
        for(int i = 1; i < k; i++){ 
            System.out.print(val+ " "); 
            sum += val; 
            val += 2; 
        } 
        System.out.print(n - sum +"\n"); 
    } 
    else
        System.out.print("NO \n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 100; 
    int k = 4; 
    findDistinctOddSum(n, k); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

