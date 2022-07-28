

// Java program to implement the above approach 
  
class GFG{ 
   
// Function to Count of pairs (A, B) in range 1 to N 
static int pairs(int n) 
{ 
    int [][]c = new int[10][10]; 
   
    int tmp = 1; 
   
    // count C i, j 
    for (int i = 1; i <= n; i++) { 
        if (i >= tmp * 10) 
            tmp *= 10; 
        c[i / tmp][i % 10]++; 
    } 
   
    // Calculate number of pairs 
    int ans = 0; 
    for (int i = 1; i < 10; i++) 
        for (int j = 1; j < 10; j++) 
            ans += c[i][j] * c[j][i]; 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 25; 
   
    // Function call 
    System.out.print(pairs(n)); 
   
} 
} 
  
// This code is contributed by Rajput-Ji 

