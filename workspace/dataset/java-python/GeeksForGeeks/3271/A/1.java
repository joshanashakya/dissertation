

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count of 
// integers from the range [a, b] that 
// are not divisible by c and d 
static int countNums(int a, int b, int c, int d) 
{ 
    // Numbers which are divisible by c 
    int x = b / c - (a - 1) / c; 
  
    // Numbers which are divisible by d 
    int y = b / d - (a - 1) / d; 
  
    // Find lowest common factor of c and d 
    int k = (c * d) / __gcd(c, d); 
  
    // Numbers which are divisible by both c and d 
    int z = b / k - (a - 1) / k; 
  
    // Return the required answer 
    return b - a + 1 - x - y + z; 
} 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int a = 10, b = 50, c = 4, d = 6; 
  
    System.out.println(countNums(a, b, c, d)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

