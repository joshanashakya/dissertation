

// Java code of above approach 
import java.util.*; 
  
class GFG  
{ 
  
// Find the probability that a 
// n digit number is palindrome 
static void solve(int n) 
{ 
    int n_2 = n / 2; 
  
    // Denominator 
    String den; 
    den = "1"; 
  
    // Assign 10^(floor(n/2)) to 
    // denominator 
    while (n_2-- > 0) 
        den += '0'; 
  
    // Display the answer 
    System.out.println(1 + "/" + den); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int N = 5; 
  
    solve(N); 
} 
}  
  
// This code is contributed by Rajput-Ji 

