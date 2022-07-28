

// Java implementation of above approach 
class GFG  
{ 
  
// Function to calculate value of X 
static int valueofX(int ar[], int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
    { 
        sum = sum + ar[i]; 
    } 
  
    if (sum % n == 0) 
    { 
        return sum / n; 
    } 
    else 
    { 
        int A = sum / n, B = sum / n + 1; 
        int ValueA = 0, ValueB = 0; 
  
        // Check for both possibilities 
        for (int i = 0; i < n; i++)  
        { 
            ValueA += (ar[i] - A) * (ar[i] - A); 
            ValueB += (ar[i] - B) * (ar[i] - B); 
        } 
  
        if (ValueA < ValueB) 
        { 
            return A; 
        } 
        else 
        { 
            return B; 
        } 
    } 
} 
  
// Driver Code 
public static void main(String args[])  
{ 
    int n = 7; 
    int arr[] = { 6, 9, 1, 6, 1, 3, 7 }; 
  
    System.out.println(valueofX(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

