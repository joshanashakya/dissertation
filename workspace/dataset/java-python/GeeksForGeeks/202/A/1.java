

// Java implementation of the approach 
class GFG  
{ 
  
// Creates a mul[] array for A[] and returns 
// it after filling initial values. 
static void initialize(int mul[],  
                       int div[], int size) 
{ 
  
    for (int i = 1; i < size; i++)  
    { 
        mul[i] = (mul[i] * mul[i - 1]) / div[i]; 
    } 
} 
  
// Does range update 
static void update(int l, int r, int x,  
                   int mul[], int div[]) 
{ 
    mul[l] *= x; 
    div[r + 1] *= x; 
} 
  
// Prints updated Array 
static void printArray(int ar[], int mul[],  
                       int div[], int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        ar[i] = ar[i] * mul[i]; 
        System.out.print(ar[i] + " "); 
    } 
} 
  
// Driver code; 
public static void main(String[] args) 
{ 
    // Array to be updated 
    int ar[] = { 10, 5, 20, 40 }; 
    int n = ar.length; 
  
    // Create and fill mul and div Array 
    int []mul = new int[n + 1]; 
    int []div = new int[n + 1]; 
  
    for (int i = 0; i < n + 1; i++) 
    { 
        mul[i] = div[i] = 1; 
    } 
  
    update(0, 1, 10, mul, div); 
    update(1, 3, 20, mul, div); 
    update(2, 2, 2, mul, div); 
  
    initialize(mul, div, n + 1); 
  
    printArray(ar, mul, div, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

