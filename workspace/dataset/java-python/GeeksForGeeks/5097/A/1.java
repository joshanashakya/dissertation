

// Java program to count 
// divisible pairs. 
  
class GFG { 
      
// Function returns count 
// of divisible pairs 
static int countDivisibles(int arr[],  
                              int n) 
{ 
    int res = 0; 
  
    // Iterate through all pairs 
    for (int i = 0; i < n; i++)  
        for (int j = i + 1; j < n; j++)  
          
        // Increment count if 
        // one divides other 
        if (arr[i] % arr[j] == 0 ||  
            arr[j] % arr[i] == 0)  
            res++; 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = new int[]{1, 2, 3, 9}; 
    int n = a.length; 
    System.out.print(countDivisibles(a, n)); 
} 
} 
  
// This code is contributed by Smitha. 

