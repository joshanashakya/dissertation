

// Java implementation to find k 
// odd integers such that their sum is N 
class GFG 
{ 
  
// Function to find K odd integers 
// such that their sum is N 
static void oddIntegers(int n, int k) 
{ 
    // Condition to check if there 
    // exist such K integers 
    if (n % 2 != k % 2) { 
        System.out.println("-1"); 
        return; 
    } 
  
    int sum = 0; 
    int i = 1; 
    int j = 1; 
  
    // Loop to find first K-1 
    // distinct odd integers 
    while (j < k) { 
        sum = sum + i; 
        System.out.print(i+" "); 
        i = i + 2; 
        j++; 
    } 
  
    // Final Kth odd number 
    int finalOdd = n - sum; 
      
    System.out.println(finalOdd); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 10; 
    int k = 2; 
  
    oddIntegers(n, k); 
} 
} 
  
// This code is contributed by shubhamsingh 

