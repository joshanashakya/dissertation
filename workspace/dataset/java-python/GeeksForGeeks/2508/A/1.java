

// Java program to calculate the maximum 
// absolute difference of an array. 
public class MaximumAbsoluteDifference 
{ 
    private static int calculateDiff(int i, int j,  
                                     int[] array) 
    { 
        // Utility function to calculate 
        // the value of absolute difference 
        // for the pair (i, j). 
        return Math.abs(array[i] - array[j]) +  
                            Math.abs(i - j); 
    } 
  
    // Function to return maximum absolute 
    // difference in brute force. 
    private static int maxDistance(int[] array) 
    { 
        // Variable for storing the maximum 
        // absolute distance throughout the 
        // traversal of loops. 
        int result = 0; 
  
        // Iterate through all pairs. 
        for (int i = 0; i < array.length; i++)  
        { 
            for (int j = i; j < array.length; j++) 
            { 
  
                // If the absolute difference of 
                // current pair (i, j) is greater 
                // than the maximum difference 
                // calculated till now, update 
                // the value of result. 
                result = Math.max(result, calculateDiff(i, j, array)); 
            } 
        } 
        return result; 
    } 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
        int[] array = { -70, -64, -6, -56, 64, 
                        61, -57, 16, 48, -98 }; 
        System.out.println(maxDistance(array)); 
    } 
} 
  
// This code is contributed by Harikrishnan Rajan 

