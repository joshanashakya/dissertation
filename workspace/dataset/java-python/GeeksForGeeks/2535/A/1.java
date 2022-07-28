

// Java implementation of the approach  
class GFG 
{ 
  
// Function to print the required permutation  
    static void printPermutation(int n, int k) 
    { 
  
        // Not possible  
        if (k >= n || (n % 2 == 0 && k == 0))  
        { 
            System.out.print(-1); 
            return; 
        } 
        int per[] = new int[n + 1], i; 
  
        // Initial permutation  
        for (i = 1; i <= n; i++) 
        { 
            per[i] = i; 
        } 
  
        // Indices for which gcd(p[i], i) > 1  
        // in the initial permutation  
        int cnt = n - 1; 
        i = 2; 
        while (i < n)  
        { 
  
            // Reduce the count by 2  
            if (cnt - 1 > k) 
            { 
                swap(per, i, i + 1); 
                cnt -= 2; 
            }  
              
            // Reduce the count by 1  
            else if (cnt - 1 == k)  
            { 
                swap(per, 1, i); 
                cnt--; 
            }  
            else
            { 
                break; 
            } 
            i += 2; 
        } 
  
        // Print the permutation  
        for (i = 1; i <= n; i++) 
        { 
            System.out.print(per[i] + " "); 
        } 
    } 
  
    static int[] swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
      
    // Driver code  
    public static void main(String[] args) 
    { 
        int n = 4, k = 3; 
        printPermutation(n, k); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

