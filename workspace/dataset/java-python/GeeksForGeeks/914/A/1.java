

// Java Program to count the number  
// of digits that can be removed such  
// that number is divisible by 10^K  
  
public class GFG{ 
      
    // function to return the required  
    // number of digits to be removed  
    static int countDigitsToBeRemoved(int N, int K)  
    {  
        // Converting the given number  
        // into string  
        String s = Integer.toString(N);  
      
        // variable to store number of  
        // digits to be removed  
        int res = 0;  
      
        // variable to denote if atleast  
        // one zero has been found  
        int f_zero = 0;  
        for (int i = s.length() - 1; i >= 0; i--) {  
            if (K == 0)  
                return res;  
            if (s.charAt(i) == '0') {  
      
                // zero found  
                f_zero = 1;  
                K--;  
            }  
            else
                res++;  
        }  
      
        // return size - 1 if K is not zero and  
        // atleast one zero is present, otherwise  
        // result  
        if (K == 0)  
            return res;  
        else if (f_zero == 1)  
            return s.length() - 1;  
        return -1;  
    }  
      
    // Driver Code to test above function  
    public static void main(String []args) 
    {  
        int N = 10904025; 
        int K = 2;  
        System.out.println(countDigitsToBeRemoved(N, K)) ;  
      
        N = 1000 ; 
        K = 5;  
        System.out.println(countDigitsToBeRemoved(N, K))  ; 
      
        N = 23985; 
        K = 2;  
        System.out.println(countDigitsToBeRemoved(N, K)) ;  
    }  
  
    // This code is contributed by Ryuga 
    } 

