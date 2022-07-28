

// Java implementation of the approach  
class GFG  
{ 
      
// Function to return the count of  
// n-digit numbers that satisfy  
// the given conditions  
static int count_numbers(int k, int n, 
                         boolean flag)  
{  
  
    // Base case  
    if (n == 1)  
    {  
  
        // If 0 wasn't chosen previously  
        if (flag)  
        {  
            return (k - 1);  
        }  
        else 
        {  
            return 1;  
        }  
    }  
  
    // If 0 wasn't chosen previously  
    if (flag)  
        return (k - 1) * (count_numbers(k, n - 1, false) + 
                          count_numbers(k, n - 1, true));  
    else
        return count_numbers(k, n - 1, true);  
}  
  
// Driver code  
public static void main (String[] args) 
{  
    int n = 3;  
    int k = 10;  
    System.out.println(count_numbers(k, n, true));  
}  
} 
  
// This code is contributed by AnkitRai01 

