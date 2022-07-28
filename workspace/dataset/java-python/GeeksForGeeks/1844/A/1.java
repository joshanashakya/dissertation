

// Java implementation of the approach  
class GFG  
{  
      
// Function to return the required XOR  
static long computeXOR(int n)  
{  
    // Modulus operator are expensive  
    // on most of the computers.  
    // n & 3 will be equivalent to n % 4  
    // n % 4  
    int x = n & 3;  
    switch (x)  
    {  
  
        // If n is a multiple of 4  
        case 0:  
            return n;  
      
        // If n % 4 gives remainder 1  
        case 1:  
            return 1;  
      
        // If n % 4 gives remainder 2  
        case 2:  
            return n + 1;  
      
        // If n % 4 gives remainder 3  
        case 3:  
            return 0;  
    }  
    return 0;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int l = 1, r = 4;  
    System.out.println(computeXOR(r) ^  
                       computeXOR(l - 1));  
}  
}  
  
// This code is contributed by Ryuga 

