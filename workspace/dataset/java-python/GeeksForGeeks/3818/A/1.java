

// Java program, to find length of the  
// largest subarray with GCD equals to 1. 
class GFG { 
      
    static int ___gcd(int a, int b) 
    { 
          
        // Everything divides 0  
        if (a == 0 || b == 0) 
            return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return ___gcd(a - b, b); 
              
        return ___gcd(a, b - a); 
    }  
      
    static int findLargest(int arr[],  
                                int n) 
    { 
          
        /*If gcd of any subarray is 1  
        then gcd of any number with the  
        sub array will be 1. so if we  
        are getting any subarray with 
        gcd 1, then maximum number of 
        element of the subarray will  
        be equal to the number of   
        elements of the array. Else  
        it will be -1.*/
        int gcd = arr[0]; 
          
        for (int i = 1; i < n; i++) 
            gcd = ___gcd(gcd, arr[i]); 
      
        return (gcd == 1)? n : -1; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int arr[] = {1, 3, 5, 7}; 
        int n = arr.length; 
          
        System.out.print("Length of the " 
                   + "largest subarray = "
                   + findLargest(arr, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

