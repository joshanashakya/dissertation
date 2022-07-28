

// Java program to find  
// if product of every pair 
// is present in array. 
  
class GFG 
{ 
    // Returns true if product  
    // of every pair in arr[] 
    // is present in arr[] 
    static boolean checkArray(int arr[] ,  
                              int n) 
    { 
        // variable to store number 
        //  of zeroes, ones, minus  
        // one and other numbers. 
        int zero = 0, one = 0,  
            minusone = 0, other=0; 
        for (int i = 0; i < n; i++) 
        { 
            // incrementing the 
            // variable values 
            if (arr[i] == 0) 
                zero++; 
            else if (arr[i] == 1) 
                one++; 
            else if (arr[i] == -1) 
                minusone++; 
            else
                other++; 
        } 
      
        // checking the conditions 
        if (other > 1) 
            return false; 
        else if (other != 0 &&  
                 minusone != 0) 
            return false; 
        else if (minusone >= 1 && 
                 one == 0) 
            return false; 
      
        return true; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int arr[] = {0, 1, 1, 10}; 
        int n = arr.length; 
        if (checkArray(arr, n)) 
        System.out.println("Yes"); 
        else
        System.out.println("No"); 
    } 
} 
  
// This code is contributed by Harsh Agarwal 

