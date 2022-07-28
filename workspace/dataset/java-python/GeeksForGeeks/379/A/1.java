

// Java program to find the maximum score after 
// flipping a Binary Matrix atmost K times 
import java.util.*; 
  
class GFG 
{ 
  
static int n = 3; 
static int m = 4; 
  
// Function to find maximum score of matrix 
static int maxMatrixScore(int A[][], int K) 
{ 
    HashMap<Integer,Integer> update =  
        new HashMap<Integer,Integer>(); 
  
    // find value of rows having first 
    // column value equal to zero 
    for (int i = 0; i < n; ++i) 
    { 
        if (A[i][0] == 0) 
        { 
            int ans = 0; 
  
            for (int j = 1; j < m; ++j) 
                ans = (int) (ans + A[i][j] * 
                        Math.pow(2, m - j - 1)); 
  
            update.put(ans, i); 
        } 
    } 
  
    // Update those rows which lead to 
    // maximum score after toggle 
    for (Map.Entry<Integer,Integer> it : update.entrySet())  
    if (K > 0 ) 
    { 
        int idx = it.getValue(); 
  
        for (int j = 0; j < m; ++j) 
            A[idx][j] = (A[idx][j] + 1) % 2; 
  
        K--; 
    } 
  
    // Calculating answer 
    int ans = 0; 
  
    for (int j = 0; j < m; ++j) 
    { 
  
        int zero = 0, one = 0; 
  
        for (int i = 0; i < n; ++i) 
        { 
            if(A[i][j] == 0)  
                zero++;  
            else
                one++; 
        } 
  
        // Check if K > 0 we can toggle if necessary. 
        if (K > 0 && zero > one)  
        { 
            ans += zero * Math.pow(2, m - j - 1); 
            K--; 
        } 
        else
            ans += one * Math.pow(2, m - j - 1); 
    } 
  
    // return max answer possible 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int A[][] = { { 0, 0, 1, 1 }, 
                    { 1, 0, 1, 0 }, 
                    { 1, 1, 0, 0 } }; 
    int K = 2; 
      
    // function call to print required answer 
    System.out.print(maxMatrixScore(A, K)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

