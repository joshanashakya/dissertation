

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of total 
    // binary prefix which are divisible by x 
    public static int CntDivbyX(int arr[], int n, int x) 
    { 
  
        // Initialize with zero 
        int number = 0; 
        int count = 0; 
  
        for (int i = 0; i < n; i++) { 
  
            // Instead of converting all prefixes 
            // to decimal, take reminder with x 
            number = (number * 2 + arr[i]) % x; 
  
            // If number is divisible by x 
            // then reminder = 0 
            if (number == 0) 
                count += 1; 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 0, 1, 0, 1, 1, 0 }; 
        int n = 7; 
        int x = 2; 
        System.out.print(CntDivbyX(arr, n, x)); 
    } 
} 

