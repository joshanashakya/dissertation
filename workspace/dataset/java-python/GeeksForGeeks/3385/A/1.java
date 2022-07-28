

// Java implementation of the approach 
class GFG  
{ 
      
    // method to get maximum number from array elements 
    static int getMax(int inputArray []) 
    { 
        int maxValue = inputArray[0]; 
  
        for(int i = 1; i < inputArray.length; i++) 
        { 
            if(inputArray[i] > maxValue) 
            { 
                maxValue = inputArray[i]; 
            } 
        } 
        return maxValue; 
    } 
      
    // Function to return the minimum steps  
    // required to reduce all the elements to 0  
    static int minSteps(int arr[], int n)  
    {  
      
        // Maximum element from the array  
        int maxVal = getMax(arr);  
        return maxVal;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 2, 4 };  
        int n = arr.length;  
      
        System.out.println(minSteps(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

