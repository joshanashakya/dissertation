

// Java program to implement 
// the above approach 
  
class GFG { 
  
    // Function that returns the number of pairs 
    static int count_pairs(int a[], int b[], int n, int m) 
    { 
  
        // Count of odd and even numbers 
        int odd1 = 0, even1 = 0; 
        int odd2 = 0, even2 = 0; 
  
        // Traverse in the first array 
        // and count the number of odd 
        // and evene numbers in them 
        for (int i = 0; i < n; i++) { 
            if (a[i] % 2 == 1) { 
                odd1++; 
            } 
            else { 
                even1++; 
            } 
        } 
  
        // Traverse in the second array 
        // and count the number of odd 
        // and evene numbers in them 
        for (int i = 0; i < m; i++) { 
            if (b[i] % 2 == 1) { 
                odd2++; 
            } 
            else { 
                even2++; 
            } 
        } 
  
        // Count the number of pairs 
        int pairs = Math.min(odd1, even2) + Math.min(odd2, even1); 
  
        // Return the number of pairs 
        return pairs; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 9, 14, 6, 2, 11 }; 
        int b[] = { 8, 4, 7, 20 }; 
        int n = a.length; 
        int m = b.length; 
        System.out.println(count_pairs(a, b, n, m)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

