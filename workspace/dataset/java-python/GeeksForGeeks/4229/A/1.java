

// Java program to find number of permutations  
// such that sum of elements at odd index  
// and even index are equal  
class GFG { 
  
// Function that returns the number of permutations  
    static int numberOfPermutations(int a[], int n) { 
        int sumEven, sumOdd, c = 0; 
  
        // iterate for all permutations  
        do { 
            // stores the sum of odd and even index elements  
            sumEven = sumOdd = 0; 
  
            // iterate for elements in permutatio  
            for (int i = 0; i < n; i++) { 
  
                // if odd index  
                if (i % 2 == 0) { 
                    sumOdd += a[i]; 
                } else { 
                    sumEven += a[i]; 
                } 
            } 
  
            // If condition holds  
            if (sumOdd == sumEven) { 
                c++; 
            } 
  
        } while (next_permutation(a)); 
  
        // return the number of permutations  
        return c; 
    } 
  
    static boolean next_permutation(int[] p) { 
        for (int a = p.length - 2; a >= 0; --a) { 
            if (p[a] < p[a + 1]) { 
                for (int b = p.length - 1;; --b) { 
                    if (p[b] > p[a]) { 
                        int t = p[a]; 
                        p[a] = p[b]; 
                        p[b] = t; 
                        for (++a, b = p.length - 1; a < b; ++a, --b) { 
                            t = p[a]; 
                            p[a] = p[b]; 
                            p[b] = t; 
                        } 
                        return true; 
                    } 
                } 
            } 
        } 
        return false; 
    } 
// Driver Code  
  
    public static void main(String args[]) { 
        int a[] = {1, 2, 3}; 
        int n = a.length; 
        System.out.println(numberOfPermutations(a, n)); 
    } 
} 
/*This code is contributed by 29AjayKumar*/

