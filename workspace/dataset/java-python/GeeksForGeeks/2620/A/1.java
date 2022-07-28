

// Java Code to 
// Find pair with 
// maximum GCD in  
// an array 
  
class GFG { 
      
    // function to find  
    // GCD of pair with 
    // max GCD in the  
    // array 
    public static int findMaxGCD(int arr[], int n) 
    { 
        // Calculating MAX in  
        // array 
        int high = 0; 
        for (int i = 0; i < n; i++) 
            high = Math.max(high, arr[i]); 
      
        // Maintaining count array 
        int count[]=new int[high + 1]; 
        for (int i = 0; i < n; i++) 
            count[arr[i]]++; 
      
        // Variable to store 
        // the multiples of 
        // a number 
        int counter = 0; 
      
        // Iterating from MAX  
        // to 1 GCD is always 
        // between MAX and 1 
        // The first GCD found 
        // will be the highest  
        // as we are decrementing  
        // the potential GCD 
        for (int i = high; i >= 1; i--) 
        { 
            int j = i; 
      
            // Iterating from current  
            // potential GCD till it 
            // is less than MAX 
            while (j <= high) 
            { 
                // A multiple found 
                if (count[j]>0)      
                    counter+=count[j];          
      
                // Incrementing potential 
                // GCD by itself 
                // To check i, 2i, 3i.... 
                j += i; 
      
                // 2 multiples found,  
                // max GCD found 
                if (counter == 2)          
                    return i; 
            } 
            counter=0; 
        } 
    return 1; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        // Array in which pair  
        // with max GCD is to 
        // be found 
        int arr[] = {1, 2, 4, 8, 8, 12}; 
      
        // Size of array 
        int n = arr.length; 
      
        System.out.println(findMaxGCD(arr,n)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

