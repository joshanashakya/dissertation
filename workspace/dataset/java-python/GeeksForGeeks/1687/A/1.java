

// Java program to count pairs with odd OR 
  
public class GFG { 
  
// Function to count pairs with odd OR 
    static int countOddPair(int A[], int N) { 
        // Count total even numbers in 
        // array 
  
        int count = 0; 
        for (int i = 0; i < N; i++) { 
            if ((A[i] % 2 != 1)) { 
                count++; 
            } 
        } 
  
        // Even pair count 
        int evenPairCount = count * (count - 1) / 2; 
  
        // Total pairs 
        int totPairs = N * (N - 1) / 2; 
  
        // Return Odd pair count 
        return totPairs - evenPairCount; 
    } 
  
// Driver main 
    public static void main(String[] args) { 
        int A[] = {5, 6, 2, 8}; 
        int N = A.length; 
  
        System.out.println(countOddPair(A, N)); 
  
    } 
} 

