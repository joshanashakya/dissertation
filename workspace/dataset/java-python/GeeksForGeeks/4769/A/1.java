

// Java implementation of the approach 
class GFG { 
  
    // Function to return the number of anomalies 
    static int countAnomalies(int arr[], int n, int k) 
    { 
  
        // To store the count of anomalies 
        int cnt = 0; 
  
        // To store the sum of the array elements 
        int i, sum = 0; 
  
        // Find the sum of the array elements 
        for (i = 0; i < n; i++) 
            sum += arr[i]; 
  
        // Count the anomalies 
        for (i = 0; i < n; i++) 
            if (Math.abs(arr[i] - (sum - arr[i])) > k) 
                cnt++; 
  
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 5 }; 
        int n = arr.length; 
        int k = 1; 
        System.out.print(countAnomalies(arr, n, k)); 
    } 
} 

