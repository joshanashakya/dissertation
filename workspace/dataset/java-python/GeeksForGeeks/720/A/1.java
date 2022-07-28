

// Java implementation of the approach 
class GFG { 
  
    // Function to find the count of required pairs 
    static void CalculatePairs(int a[], int n) 
    { 
  
        // To store the count of elements which 
        // give remainder 0 i.e. even values 
        int cnt_zero = 0; 
  
        // To store the count of elements which 
        // give remainder 1 i.e. odd values 
        int cnt_one = 0; 
  
        for (int i = 0; i < n; i++) { 
  
            if (a[i] % 2 == 0) 
                cnt_zero += 1; 
            else
                cnt_one += 1; 
        } 
  
        int total_XOR_pairs = cnt_zero * cnt_one; 
        int total_AND_pairs = (cnt_one) * (cnt_one - 1) / 2; 
        int total_OR_pairs = cnt_zero * cnt_one 
                             + (cnt_one) * (cnt_one - 1) / 2; 
  
        System.out.println("cntXOR = " + total_XOR_pairs); 
        System.out.println("cntAND = " + total_AND_pairs); 
        System.out.println("cntOR = " + total_OR_pairs); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 1, 3, 4, 2 }; 
        int n = a.length; 
  
        CalculatePairs(a, n); 
    } 
} 

