

// Java program to count the  
// number of ways to form  
// arrays of N numbers such  
// that the first and last  
// numbers are fixed and all  
// consecutive numbers are  
// distinct 
import java.io.*; 
  
class GFG  
{ 
  
// Returns the total ways to  
// form arrays such that every  
// consecutive element is  
// different and each element  
// except the first and last  
// can take values from 1 to M 
static int totalWays(int N,  
                     int M, int X) 
{ 
  
    // define the dp[][] array 
    int dp[][] = new int[N + 1][2]; 
  
    // if the first element is 1 
    if (X == 1)  
    { 
  
        // there is only one  
        // way to place a 1  
        // at the first index 
        dp[0][0] = 1; 
    } 
    else 
    { 
  
        // the value at first index  
        // needs to be 1, thus there  
        // is no way to place a  
        // non-one integer 
        dp[0][1] = 0; 
    } 
  
    // if the first element was 1  
    // then at index 1, only non  
    // one integer can be placed  
    // thus there are M - 1 ways  
    // to place a non one integer 
    // at index 2 and 0 ways to  
    // place a 1 at the 2nd index 
    if (X == 1) 
    { 
        dp[1][0] = 0; 
        dp[1][1] = M - 1; 
    } 
  
    // Else there is one way to  
    // place a one at index 2  
    // and if a non one needs to  
    // be placed here, there are  
    // (M - 2) options, i.e neither 
    // the element at this index 
    // should be 1, neither should  
    // it be equal to the previous  
    // element 
    else 
    { 
        dp[1][0] = 1; 
        dp[1][1] = (M - 2); 
    } 
  
    // Build the dp array 
    // in bottom up manner 
    for (int i = 2; i < N; i++)  
    { 
  
        // f(i, one) = f(i - 1,  
        // non-one) 
        dp[i][0] = dp[i - 1][1]; 
  
        // f(i, non-one) =  
        // f(i - 1, one) * (M - 1) + 
        // f(i - 1, non-one) * (M - 2) 
        dp[i][1] = dp[i - 1][0] * (M - 1) +  
                   dp[i - 1][1] * (M - 2); 
    } 
  
    // last element needs to be 
    // one, so return dp[n - 1][0] 
    return dp[N - 1][0]; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int N = 4, M = 3, X = 2; 
    System.out.println(totalWays(N, M, X)); 
} 
} 
  
// This code is contributed by anuj_67. 

