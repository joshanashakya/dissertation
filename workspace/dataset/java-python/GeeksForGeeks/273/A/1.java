

// Java code to count total perfect 
// divisors 
class GFG 
{ 
      
static int MAX = 100001; 
  
static int[] perfectDiv = new int[MAX]; 
  
// Pre-compute counts of all perfect divisors 
// of all numbers upto MAX. 
static void precomputeCounts() 
{ 
    for (int i = 1; i * i < MAX; ++i) 
    { 
        // Iterate through all the multiples of i*i 
        for (int j = i * i; j < MAX; j += i * i) 
  
            // Increment all such multiples by 1 
            ++perfectDiv[j]; 
    } 
} 
  
// Returns count of perfect divisors of n. 
static int countPerfectDivisors(int n) 
{ 
    return perfectDiv[n]; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    precomputeCounts(); 
  
    int n = 16; 
    System.out.println("Total perfect divisors of " + 
                    n + " = " + countPerfectDivisors(n)); 
  
    n = 12; 
    System.out.println("Total perfect divisors of " + 
                        n + " = " + countPerfectDivisors(n)); 
} 
} 
  
// This code is contributed by mits 

