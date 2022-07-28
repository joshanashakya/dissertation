

// Java program to find nth term 
import java.lang.*; 
  
class GFG { 
      
// utility function 
static int findTerm(int n) 
{ 
    if (n == 1) 
    return n; 
  
    else { 
  
    // since first element of the 
    // series is 7, we initailise 
    // a variable with 7 
    int term = 7; 
  
    // Using iteration to find nth 
    // term 
    for (int i = 2; i <= n; i++) 
        term = term * 2 + (i - 1); 
  
    return term; 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
    System.out.print(findTerm(n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

