

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to count the unique numbers 
static void count_unique(HashSet<Integer>s, int n) 
{ 
  
    // If the number has 
    // already been visited 
    if (s.contains(n)) 
        return; 
  
    // Insert the number to the set 
    s.add(n); 
  
    // First step 
    n += 1; 
  
    // Second step 
    // remove trailing zeros 
    while (n % 10 == 0) 
    { 
        n = n / 10; 
    } 
  
    // Recur again for the new number 
    count_unique(s, n); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 10; 
    HashSet<Integer>s = new HashSet<>(); 
    count_unique(s, n); 
    System.out.println(s.size()); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

