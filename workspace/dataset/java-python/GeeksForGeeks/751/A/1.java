

// Java implementation of the approach 
class GFG  
{  
  
// Function to print the required  
// permutation 
static void arrange(int N) 
{ 
    if (N == 1)  
    { 
        System.out.println("1"); 
        return; 
    } 
  
    // No permutation is possible 
    // satisfying the given condition 
    if (N == 2 || N == 3)  
    { 
        System.out.println("-1"); 
        return; 
    } 
  
    // Maximum even and odd elements < N 
    int even = -1, odd = -1; 
    if (N % 2 == 0)  
    { 
        even = N; 
        odd = N - 1; 
    } 
    else
    { 
        odd = N; 
        even = N - 1; 
    } 
  
    // Print all odd elements in 
    // decreasing order 
    while (odd >= 1)  
    { 
        System.out.print(odd); 
        System.out.print(" "); 
      
        // Next element must be odd 
        odd = odd - 2; 
    } 
  
    // Print all even elements in 
    // decreasing order 
    while (even >= 2)  
    { 
        System.out.print(even); 
        System.out.print(" "); 
  
        // Next element must be even 
        even = even - 2; 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{  
    int N = 5; 
    arrange(N); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai 

