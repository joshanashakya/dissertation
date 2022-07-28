

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the minimum required difference 
    static int findMinDifference(int arr[], int n) 
    { 
        int min, secondMin, max, secondMax; 
  
        min = secondMax = (arr[0] < arr[1]) ? arr[0] : arr[1]; 
        max = secondMin = (arr[0] < arr[1]) ? arr[1] : arr[0]; 
  
        for (int i = 2; i < n; i++) { 
  
            // If current element is greater than max 
            if (arr[i] > max) { 
  
                // max will become secondMax 
                secondMax = max; 
  
                // Update the max 
                max = arr[i]; 
            } 
  
            // If current element is greater than secondMax 
            // but smaller than max 
            else if (arr[i] > secondMax) { 
  
                // Update the secondMax 
                secondMax = arr[i]; 
            } 
  
            // If current element is smaller than min 
            else if (arr[i] < min) { 
  
                // min will become secondMin 
                secondMin = min; 
  
                // Update the min 
                min = arr[i]; 
            } 
  
            // If current element is smaller than secondMin 
            // but greater than min 
            else if (arr[i] < secondMin) { 
  
                // Update the secondMin 
                secondMin = arr[i]; 
            } 
        } 
  
        // Minimum of the two possible differences 
        int diff = Math.min(max - secondMin, secondMax - min); 
  
        return diff; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 4, 3, 4 }; 
        int n = arr.length; 
  
        System.out.println(findMinDifference(arr, n)); 
    } 
} 

