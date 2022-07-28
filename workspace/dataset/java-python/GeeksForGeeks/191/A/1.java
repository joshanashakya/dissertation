

class GFG  
{ 
  
// Function to check the condition 
static boolean check(int H, int S) 
{ 
    // Condition for triangle to exist 
    return H * H >= 4 * S; 
} 
  
// Function to find all pairs 
static int findPairs(int H[], int n,  
                     int S[], int m) 
{ 
    int count = 0; 
  
    // Checkinag all possible pairs 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < m; j++)  
        { 
            if (check(H[i], S[j])) 
                count++; 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int H[] = { 1, 6, 4 }; 
    int n = H.length; 
      
    int S[] = { 23, 3, 42, 14 }; 
    int m = S.length; 
      
    System.out.println(findPairs(H, n, S, m)); 
} 
} 
  
// This code is contributed  
// by ankita_saini 

