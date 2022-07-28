

/*package whatever //do not write package name here */
import java.util.Arrays;  
import java.io.*; 
  
class GFG { 
      
// Function to check the condition 
static boolean check(int H, int S) 
{ 
    // Condition for triangle to exist 
    return H * H >= 4 * S; 
} 
  
// Function to find all pairs 
static int findPairs(int H[], int n, int S[], int m) 
{ 
    int count = 0; 
      
    // Sort both the arrays 
    Arrays.sort(H); 
    Arrays.sort(S); 
  
    // To keep track of last possible Area 
    int index = -1; 
      
    for (int i = 0; i < n; i++) { 
        // Apply Binary Search for 
        // each Hypotenuse Length 
        int start = 0; 
        int end = m - 1; 
          
        while (start <= end) { 
            int mid = start + (end - start) / 2; 
            if (check(H[i], S[mid])) { 
                index = mid; 
                start = mid + 1; 
            } 
            else { 
                end = mid - 1; 
            } 
        } 
          
        // Check if we get any 
        // possible Area or Not 
        if (index != -1) { 
            // All area less than area[index]  
            // satisfy property 
            count += index + 1; 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
    public static void main (String[] args) { 
          
    int H[] = { 1, 6, 4 }; 
    int n = H.length; 
      
    int S[] = { 23, 3, 42, 14 }; 
    int m = S.length; 
      
    System.out.println(findPairs(H, n, S, m)); 
    } 
      
// This code is contributed  
// by ajit... 
} 

