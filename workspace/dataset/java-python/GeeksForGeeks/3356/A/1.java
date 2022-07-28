

// Java implementation of above approach 
class GFG { 
  
    public static void countWays(int a[], int n) 
    { 
  
        int i, j; 
        long suff[] = new long[n]; 
        if (a[n - 1] == 2) 
            suff[n - 1] = 1; 
  
        // Taking the frequncy suffix sum of the 
        // number of 2's present after every index 
        for (i = n - 2; i >= 0; i--) { 
            if (a[i] == 2) 
                suff[i] = suff[i + 1] + 1; 
            else
                suff[i] = suff[i + 1]; 
        } 
  
        // Storing the count of subsequence 
        long ss = 0; 
  
        // Subsequence of length 2 
        for (i = 0; i < n; i++) { 
            if (a[i] == 1) 
                ss += suff[i]; 
        } 
  
        // Subsequence of length 4 of type 1 1 2 2 
        for (i = 0; i < n; i++) { 
            for (j = i + 1; j < n; j++) { 
                if (a[i] == 1 && a[j] == 1 && suff[j] >= 2) { 
                    ss += (suff[j]) * (suff[j] - 1) / 2; 
                } 
            } 
        } 
  
        // Subsequence of length 4 of type 1 2 1 2 
        for (i = 0; i < n; i++) { 
            for (j = i + 1; j < n; j++) { 
                if (a[i] == 1 && a[j] == 1 &&  
                   (suff[i] - suff[j]) >= 1 && suff[j] >= 1) { 
                    ss += (suff[i] - suff[j]) * suff[j]; 
                } 
            } 
        } 
        System.out.println(ss); 
    } 
    public static void main(String[] args) 
    { 
  
        int a[] = { 1, 2, 1, 1, 2, 2 }; 
        int n = 6; 
        countWays(a, n); 
    } 
} 

