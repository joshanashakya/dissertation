

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count 
// of set bits in n 
static int countSetBits(int n) 
{ 
    int count = 0; 
    while (n > 0)  
    { 
        n &= (n - 1); 
        count++; 
    } 
    return count; 
} 
  
// Function to return the count 
// of required pairs 
static int pairs(int arr[], int n, int k) 
{ 
  
    // To store the count 
    int count = 0; 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = i + 1; j < n; j++)  
        { 
  
            // Sum of set bits in both the integers 
            int sum = countSetBits(arr[i]) 
                    + countSetBits(arr[j]); 
  
            // If current pair satisfies 
            // the given condition 
            if (sum == k) 
                count++; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int arr[] = { 1, 2, 3, 4, 5 }; 
    int n = arr.length; 
    int k = 4; 
    System.out.println(pairs(arr, n, k)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

