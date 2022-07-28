

// Java implementation of above idea 
public class GFG { 
  
    // Function to return the index of the rightmost 
    // minimum element from the array 
    public static int getRightMin(int arr[], int n) 
    { 
  
        // First element is the minimum in a sorted array 
        int min = arr[0]; 
        int rightMin = 0; 
        int i = 1; 
        while (i < n) { 
  
            // While the elements are equal to the minimum 
            // update rightMin 
            if (arr[i] == min) 
                rightMin = i; 
  
            i *= 2; 
        } 
  
        i = rightMin + 1; 
  
        // Final check whether there are any elements 
        // which are equal to the minimum 
        while (i < n && arr[i] == min) { 
            rightMin = i; 
            i++; 
        } 
  
        return rightMin; 
    } 
  
    // Function to return the index of the leftmost 
    // maximum element from the array 
    public static int getLeftMax(int arr[], int n) 
    { 
  
        // Last element is the maximum in a sorted array 
        int max = arr[n - 1]; 
        int leftMax = n - 1; 
        int i = n - 2; 
        while (i > 0) { 
  
            // While the elements are equal to the maximum 
            // update leftMax 
            if (arr[i] == max) 
                leftMax = i; 
  
            i /= 2; 
        } 
  
        i = leftMax - 1; 
  
        // Final check whether there are any elements 
        // which are equal to the maximum 
        while (i >= 0 && arr[i] == max) { 
            leftMax = i; 
            i--; 
        } 
  
        return leftMax; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 0, 0, 1, 2, 5, 5, 6, 8, 8 }; 
        int n = arr.length; 
  
        // First element is the leftmost minimum in a sorted array 
        System.out.println("Minimum left : " + 0); 
        System.out.println("Minimum right : " + getRightMin(arr, n)); 
        System.out.println("Maximum left : " + getLeftMax(arr, n)); 
  
        // Last element is the rightmost maximum in a sorted array 
        System.out.println("Maximum right : " + (n - 1)); 
    } 
} 

