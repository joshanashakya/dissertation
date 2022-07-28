

// Java program to represent a  
// number as sum of a co-prime  
// pair such that difference  
// between them is minimum 
class GFG  
{ 
    static int __gcd(int a, int b) 
    { 
        return b == 0 ? a :  
           __gcd(b, a % b); 
    } 
      
    // function to check if pair 
    // is co-prime or not 
    static boolean coprime(int a, int b) 
    { 
        return (__gcd(a, b) == 1); 
    } 
      
    // function to find and  
    // print co-prime pair 
    static void pairSum(int n) 
    { 
        int mid = n / 2; 
      
        for (int i = mid; i >= 1; i--) 
        { 
            if (coprime(i, n - i) == true) 
            { 
                System.out.print( i + " " +  
                                  (n - i)); 
                break; 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        int n = 11; 
        pairSum(n); 
          
    } 
} 
  
// This code is contributed by Sam007 

