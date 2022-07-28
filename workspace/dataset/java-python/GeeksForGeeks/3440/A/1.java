

// Java Program to implement 
// standard error of mean. 
  
class GFG { 
  
    // Function to find sample mean. 
    static float mean(float arr[], int n) 
    { 
        // loop to calculate 
        // sum of array elements. 
        float sum = 0; 
        for (int i = 0; i < n; i++) 
            sum = sum + arr[i]; 
  
        return sum / n; 
    } 
  
    // Function to calculate sample 
    // standard deviation. 
    static float SSD(float arr[], int n) 
    { 
        float sum = 0; 
        for (int i = 0; i < n; i++) 
            sum = sum + (arr[i] - mean(arr, n))  
                  * (arr[i] - mean(arr, n)); 
  
        return (float)Math.sqrt(sum / (n - 1)); 
    } 
  
    // Function to calculate sample error. 
    static float sampleError(float arr[], int n) 
    { 
        // Formula to find sample error. 
        return SSD(arr, n) / (float)Math.sqrt(n); 
    } 
  
    // Driver function 
    public static void main(String[] args) 
    { 
        float arr[] = { 78.53f, 79.62f, 80.25f,  
                       81.05f, 83.21f, 83.46f }; 
        int n = arr.length; 
        System.out.println(sampleError(arr, n)); 
    } 
} 
  
// This code is contributed  
// by  prerna saini 

