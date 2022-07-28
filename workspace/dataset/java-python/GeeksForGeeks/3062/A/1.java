

// Java implementation of the approach 
class GFG { 
  
    static int MAX = 25; 
  
    // Function to return the minimized sum 
    static int getMinSum(int arr[], int n) 
    { 
        int bits_count[] = new int[MAX], 
            max_bit = 0, sum = 0, ans = 0; 
  
        // To store the frequency 
        // of bit in every element 
        for (int d = 0; d < n; d++) { 
            int e = arr[d], f = 0; 
            while (e > 0) { 
                int rem = e % 2; 
                e = e / 2; 
                if (rem == 1) { 
                    bits_count[f] += rem; 
                } 
                f++; 
            } 
            max_bit = Math.max(max_bit, f); 
        } 
  
        // Finding element X 
        for (int d = 0; d < max_bit; d++) { 
            int temp = (int)Math.pow(2, d); 
            if (bits_count[d] > n / 2) 
                ans = ans + temp; 
        } 
  
        // Taking XOR of elements and finding sum 
        for (int d = 0; d < n; d++) { 
            arr[d] = arr[d] ^ ans; 
            sum = sum + arr[d]; 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 3, 5, 7, 11, 15 }; 
        int n = arr.length; 
        System.out.println(getMinSum(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

