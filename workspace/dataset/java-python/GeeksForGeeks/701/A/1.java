

// Java implementation of the approach  
class GfG  
{ 
  
// Function to return the count of trailing zeroes  
static long getTrailingZeroes(long n)  
{  
    long count = 0;  
    long val, powerTwo = 2;  
  
    // Implementation of the Legendre's formula  
    do 
    {  
        val = n / powerTwo;  
        count += val;  
        powerTwo *= 2;  
    } while (val != 0);  
  
    // Count has the highest power of 2  
    // that divides n! in base 10  
    return (count / 4);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int n = 6;  
    System.out.println(getTrailingZeroes(n));  
}  
} 
  
// This code is contributed by  
// Prerna Saini. 

