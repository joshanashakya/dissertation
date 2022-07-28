

// Java program to find the 
// maximum length of equal subString 
// within a given cost 
class GFG 
{ 
  
// Function to find the maximum length 
static int solve(String X, String Y, 
                int N, int K) 
{ 
  
    int []count = new int[N + 1]; 
    int sol = 0; 
    count[0] = 0; 
  
    // Fill the prefix array with 
    // the difference of letters 
    for (int i = 1; i <= N; i++)  
    { 
  
        count[i] = count[i - 1] +  
                Math.abs(X.charAt(i - 1) -  
                Y.charAt(i - 1)); 
    } 
  
    int j = 0; 
  
    for (int i = 1; i <= N; i++) 
    { 
        while ((count[i] - count[j]) > K) 
        { 
            j++; 
        } 
  
        // Update the maximum length 
        sol = Math.max(sol, i - j); 
    } 
  
    return sol; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int N = 4; 
    String X = "abcd", Y = "bcde"; 
    int K = 3; 
  
    System.out.print(solve(X, Y, N, K) + "\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

