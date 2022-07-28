

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the highest 
// power of p that divides n 
static int countFactors(int n, int p) 
{ 
    int pwr = 0; 
    while (n > 0 && n % p == 0)  
    { 
        n /= p; 
        pwr++; 
    } 
    return pwr; 
} 
  
// Function to return the count of times p 
// appaers in the prime factors of the 
// elements from the range [l, r] 
static int getCount(int l, int r, int p) 
{ 
  
    // To store the required count 
    int cnt = 0; 
  
    // For every element of the range 
    for (int i = l; i <= r; i++)  
    { 
  
        // Add the highest power of 
        // p that divides i 
        cnt += countFactors(i, p); 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 2, r = 8, p = 2; 
  
    System.out.println(getCount(l, r, p)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

