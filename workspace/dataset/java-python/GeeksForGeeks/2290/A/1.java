

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// function that checks the 
// divisibility of the sum 
// of the digits at odd places 
// of the given number 
static boolean SumDivisible(int n, int k) 
{ 
    int sum = 0, position = 1; 
    while (n > 0) { 
  
        // if position is odd 
        if (position % 2 == 1) 
            sum += n % 10; 
        n = n / 10; 
        position++; 
    } 
  
    if (sum % k == 0) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int n = 592452; 
    int k = 3; 
  
    if (SumDivisible(n, k)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
  
} 
} 
//This code is contributed by Surendra_Gangwar 

