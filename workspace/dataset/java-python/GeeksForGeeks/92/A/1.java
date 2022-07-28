

// Java program to find if array  
// elements can be made same 
  
class GFG 
{ 
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
      
    // To calculate LCM of whole array 
    static int lcmOfArray(int arr[], int n) 
    { 
        int ans = arr[0]; 
        for (int i = 1; i < n; i++) 
            ans = (arr[i] * ans)/ ___gcd(arr[i], ans); 
        return ans; 
    } 
      
    // function to check possibility if we can make 
    // all element same or not 
    static boolean checkArray(int arr[], int prime[],  
                                          int n, int m) 
    { 
        // Find LCM of whole array 
        int lcm = lcmOfArray(arr,n); 
      
        // One by one check if value of lcm / arr[i] 
        // can be formed using prime numbers. 
        for (int i = 0; i < n; i++) 
        { 
            // divide each element of array by LCM 
            int val = lcm / arr[i]; 
      
            // Use each input prime number to divide 
            // the result to remove all factors of 
            // input prime numbers 
            for (int j = 0; j < m && val != 1; j++) 
                while (val % prime[j] == 0) 
                    val = val / prime[j]; 
      
            // If the remaining value is not 1, then 
            // it is not possible to make all elements 
            // same. 
            if (val != 1) 
            return false; 
        } 
      
        return true; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int arr[] = {50, 200}; 
        int prime[] = {2, 3}; 
        int n = arr.length; 
        int m = prime.length; 
      
        if(checkArray(arr, prime, n, m)) 
        System.out.print("Yes"); 
        else
        System.out.print("No"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

