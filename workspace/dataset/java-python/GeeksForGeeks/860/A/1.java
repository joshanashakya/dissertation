

// Java implementation of finding first digit 
// of product of n numbers 
  
class Test { 
    // Teturns the first digit of product of elements of arr[] 
    static int FirstDigit(int arr[], int n) 
    { 
        // stores the logarithm of product of elements of arr[] 
        double S = 0; 
        for (int i = 0; i < n; i++) 
            S = S + Math.log10(arr[i] * 1.0); 
  
        // fractional(s) = s - floor(s) 
        double fract_S = S - Math.floor(S); 
  
        // ans = 10^fract_s 
        int ans = (int)Math.pow(10, fract_S); 
        return ans; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = { 5, 8, 3, 7 }; 
  
        System.out.println(FirstDigit(arr, arr.length)); 
    } 
} 

