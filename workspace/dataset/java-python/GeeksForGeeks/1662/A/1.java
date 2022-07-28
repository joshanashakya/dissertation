

// Java implementation of the approach  
class GFG 
{ 
      
// Function that returns true if n contains  
// digit m exactly k times 
static boolean digitWell(int n, int m, int k) 
{ 
    int cnt = 0; 
    while (n > 0)  
    { 
        if (n % 10 == m) 
            ++cnt; 
        n /= 10; 
    } 
    return cnt == k; 
} 
  
// Function to return the smallest integer > n  
// with digit m occurring exactly k times 
static int findInt(int n, int m, int k) 
{ 
  
    int i = n + 1; 
  
    while (true)  
    { 
        if (digitWell(i, m, k)) 
            return i; 
        i++; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 111, m = 2, k = 2; 
    System.out.println(findInt(n, m, k)); 
} 
}  
  
// This code is contributed by Code_Mech 

