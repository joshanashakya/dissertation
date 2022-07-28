

// Java implementation of the approach 
import java.util.*; 
public class GFG { 
  
    // Function to return the number to be 
    // added 
    static int getNumToAdd(int arr[], int n) 
    { 
        Arrays.sort(arr); 
        int d = arr[1] - arr[0]; 
        int numToAdd = -1; 
        boolean numAdded = false; 
  
        for (int i = 2; i < n; i++) { 
            int diff = arr[i] - arr[i - 1]; 
  
            // If difference of the current  
            // consecutive elements is 
            // different from the common 
            // difference 
            if (diff != d) { 
  
                // If number has already been 
                // chosen then it's not possible  
                // to add another number 
                if (numAdded) 
                    return -1; 
  
                // If the current different is 
                // twice the common difference  
                // then a number can be added midway 
                // from current and previous element 
                if (diff == 2 * d) { 
                    numToAdd = arr[i] - d; 
  
                    // Number has been chosen 
                    numAdded = true; 
                } 
  
                // It's not possible to maintain 
                // the common difference 
                else
                    return -1; 
            } 
        } 
  
        // Return last element + common difference 
        // if no element is chosen and the array 
        // is already in AP 
        if (numToAdd == -1) 
            return (arr[n - 1] + d); 
  
        // Else return the chosen number 
        return numToAdd; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 5, 7, 11, 13, 15 }; 
        int n = arr.length; 
        System.out.println(getNumToAdd(arr, n)); 
    } 
} 

