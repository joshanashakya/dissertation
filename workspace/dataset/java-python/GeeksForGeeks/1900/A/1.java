

//Java implementation of the above approach  
  
class GFG { 
  
// Function to find the minimum element  
    static int getMin(int arr[], int n, int k) { 
        int res = Integer.MAX_VALUE; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] % k == 0) { 
                res = Math.min(res, arr[i]); 
            } 
        } 
        return res; 
    } 
  
// Function to find the maximum element  
    static int getMax(int arr[], int n, int k) { 
        int res = Integer.MIN_VALUE; 
        for (int i = 1; i < n; i++) { 
            if (arr[i] % k == 0) { 
                res = Math.max(res, arr[i]); 
            } 
        } 
        return res; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int arr[] = {10, 1230, 45, 67, 1}; 
        int k = 10; 
        int n = arr.length; 
        System.out.println("Minimum element of array which is divisible by k: "
                + getMin(arr, n, k)); 
        System.out.println("Maximum element of array which is divisible by k: "
                + getMax(arr, n, k)); 
    } 
} 
//This code contribute by Shikha Singh 

