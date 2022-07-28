

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of elements 
// P[i] such that P[i] is the second smallest 
// among P[i-1], P[i] and P[i + 1] 
static int countElements(int p[], int n) 
{ 
    // To store the required answer 
    int ans = 0; 
  
    // Traverse from the second element 
    // to the second last element 
    for (int i = 1; i < n - 1; i++)  
    { 
        if (p[i - 1] > p[i] && p[i] > p[i + 1]) 
            ans++; 
        else if (p[i - 1] < p[i] && p[i] < p[i + 1]) 
            ans++; 
    } 
  
    // Return the required answer 
    return ans; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int p[] = { 2, 5, 1, 3, 4 }; 
    int n = p.length; 
  
    System.out.println(countElements(p, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

