

// Java implementation to find the number 
// of subsets with equal bitwise AND, 
// OR and XOR values 
import java.io.*; 
  
class GFG { 
static int mod = 1000000007; 
  
// Function to find the number of 
// subsets with equal bitwise AND, 
// OR and XOR values 
static int countSubsets(int a[], int n) 
{ 
    int answer = 0; 
  
    // Traverse through all the subsets 
    for (int i = 0; i < (1 << n); i++) { 
  
        int bitwiseAND = -1; 
        int bitwiseOR = 0; 
        int bitwiseXOR = 0; 
  
        // Finding the subsets with the bits 
        // of 'i' which are set 
        for (int j = 0; j < n; j++) { 
  
            // Computing the bitwise AND 
            if ((i & (1 << j)) == 0) { 
                if (bitwiseAND == -1) 
                    bitwiseAND = a[j]; 
                else
                    bitwiseAND &= a[j]; 
  
                // Computing the bitwise OR 
                bitwiseOR |= a[j]; 
  
                // Computing the bitwise XOR 
                bitwiseXOR ^= a[j]; 
            } 
        } 
  
        // Comparing all the three values 
        if (bitwiseAND == bitwiseOR 
            && bitwiseOR == bitwiseXOR) 
            answer = (answer + 1) % mod; 
    } 
    return answer; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int N = 6; 
    int A[] = { 1, 3, 2, 1, 2, 1 }; 
  
    System.out.print(countSubsets(A, N)); 
} 
} 
  
// This code is contributed by shivanisinghss2110 

