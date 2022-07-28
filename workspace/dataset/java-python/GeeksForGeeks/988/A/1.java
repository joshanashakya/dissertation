

//Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to return the size of the 
// longest increasing subsequence 
static int LISusingLCS(Vector<Integer> seq) 
{ 
    int n = seq.size(); 
  
    // Create an 2D array of integer 
    // for tabulation 
    int L[][] = new int [n + 1][n + 1]; 
  
    // Take the second sequence as the sorted 
    // sequence of the given sequence 
    Vector<Integer> sortedseq = new Vector<Integer>(seq); 
  
    Collections.sort(sortedseq); 
  
    // Classical Dynamic Programming algorithm 
    // for Longest Common Subsequence 
    for (int i = 0; i <= n; i++)  
    { 
        for (int j = 0; j <= n; j++)  
        { 
            if (i == 0 || j == 0) 
                L[i][j] = 0; 
  
            else if (seq.get(i - 1) == sortedseq.get(j - 1)) 
                L[i][j] = L[i - 1][j - 1] + 1; 
  
            else
                L[i][j] = Math.max(L[i - 1][j],  
                                   L[i][j - 1]); 
        } 
    } 
  
    // Return the ans 
    return L[n][n]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    Vector<Integer> sequence = new Vector<Integer>(); 
    sequence.add(12); 
    sequence.add(34); 
    sequence.add(1); 
    sequence.add(5); 
    sequence.add(40); 
    sequence.add(80); 
  
    System.out.println(LISusingLCS(sequence)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

