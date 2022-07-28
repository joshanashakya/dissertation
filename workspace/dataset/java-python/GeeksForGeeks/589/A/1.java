

// Java program to reach N-th  
// stair by taking a maximum  
// of K leap 
class GFG 
{ 
static int solve(int N, int K) 
{ 
  
    // elements of combo[] stores  
    // the no. of possible ways  
    // to reach it by all combinations 
    // of k leaps or less 
    int[] combo; 
    combo = new int[50]; 
  
    // assuming leap 0 exist  
    // and assigning its value 
    // to 1 for calculation 
    combo[0] = 1; 
  
    // loop to iterate over all 
    // possible leaps upto k; 
    for (int i = 1; i <= K; i++)  
    { 
  
        // in this loop we count all 
        // possible leaps to reach 
        // the jth stair with the  
        // help of ith leap or less 
        for (int j = 0; j <= N; j++)  
        { 
  
            // if the leap is not 
            // more than the i-j 
            if (j >= i) 
            { 
  
                // calculate the value and  
                // store in combo[j] to  
                // reuse it for next leap 
                // calculation for the  
                // jth stair 
                combo[j] += combo[j - i]; 
            } 
        } 
    } 
  
    // returns the no of possible  
    // number of leaps to reach  
    // the top of building of  
    // n stairs 
    return combo[N]; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // N i the no of total stairs 
    // K is the value of the  
    // greatest leap 
    int N = 29; 
    int K = 5; 
  
    System.out.println(solve(N, K)); 
  
    solve(N, K); 
} 
} 
  
// This code is contributed  
// by ankita_saini 

