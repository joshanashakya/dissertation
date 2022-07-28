

// JAVA Program to find weighted mean 
// of natural numbers. 
  
class GFG { 
      
    // Function to calculate weighted mean. 
    static float weightedMean(int X[], int W[], 
                                        int n) 
    { 
        int sum = 0, numWeight = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            numWeight = numWeight + X[i] * W[i]; 
            sum = sum + W[i]; 
        } 
       
        return (float)(numWeight) / sum; 
    } 
       
    // Driver program to test the function. 
    public static void main(String args[]) 
    { 
        // Take num array and corresponding  
        // weight array and initialize it. 
        int X[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int W[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
       
        // Calculate the size of array. 
        int n = X.length; 
        int m = W.length; 
       
        // Check the size of both array is  
        // equal or not. 
        if (n == m) 
            System.out.println(weightedMean(X, W, n)); 
        else
            System.out.println("-1" ); 
          
    }  
} 
  
/*This code is contributed by Nikita Tiwari.*/

