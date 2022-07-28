

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// stick[i] stores the count of sticks 
// required to represent the digit i 
static int sticks[] = { 6, 2, 5, 5, 4, 5, 
                        6, 3, 7, 6 }; 
  
// Function to return the count of 
// matchsticks required to represent 
// the given number 
static int countSticks(String str, int n) 
{ 
    int cnt = 0; 
  
    // For every digit of the given number 
    for (int i = 0; i < n; i++) 
    { 
  
        // Add the count of sticks required 
        // to represent the current digit 
        cnt += (sticks[str.charAt(i) - '0']); 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String str = "56"; 
    int n = str.length(); 
  
    System.out.println(countSticks(str, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

