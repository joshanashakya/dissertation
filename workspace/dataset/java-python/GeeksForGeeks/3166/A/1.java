

// Java implementation of the approach 
class GFG { 
  
    static int operations(int op[], int n, int k) 
    { 
        int i, count = 0; 
  
        // To store the normalized value 
        // of all the operations 
        int nVal = 0; 
  
        // Minimum possible value for 
        // a series of operations 
        int min = Integer.MAX_VALUE; 
        for (i = 0; i < n; i++) { 
            nVal += op[i]; 
            min = Math.min(min, nVal); 
  
            // If k can be reduced with 
            // first (i + 1) operations 
            if ((k + nVal) <= 0) 
                return (i + 1); 
        } 
  
        // Impossible to reduce k 
        if (nVal >= 0) 
            return -1; 
  
        // Number of times all the operations 
        // can be performed on k without 
        // reducing it to <= 0 
        int times = (k - Math.abs(min)) / Math.abs(nVal); 
  
        // Perform operations 
        k = (k - (times * Math.abs(nVal))); 
        count = (times * n); 
  
        // Final check 
        while (k > 0) { 
            for (i = 0; i < n; i++) { 
                k = k + op[i]; 
                count++; 
                if (k <= 0) 
                    break; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int op[] = { -60, 65, -1, 14, -25 }; 
        int n = op.length; 
        int k = 100000; 
  
        System.out.print(operations(op, n, k)); 
    } 
} 

