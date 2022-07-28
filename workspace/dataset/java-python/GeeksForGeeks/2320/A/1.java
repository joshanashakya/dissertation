

// Java program to find the count of all  
// possible N digit numbers which are  
// divisible by 5 formed from M digits  
  
class GFG { 
  
// Function to find the count of all  
// possible N digit numbers which are  
// divisible by 5 formed from M digits  
    static int numbers(int n, int arr[], int m) { 
        int isZero = 0, isFive = 0; 
        int result = 0; 
  
        // If it is not possible to form  
        // n digit number from the given  
        // m digits without repetition  
        if (m < n) { 
            return -1; 
        } 
  
        for (int i = 0; i < m; i++) { 
            if (arr[i] == 0) { 
                isZero = 1; 
            } 
  
            if (arr[i] == 5) { 
                isFive = 1; 
            } 
        } 
  
        // If both zero and five exists  
        if (isZero == 1 && isFive == 1) { 
            result = 2; 
  
            // Remaining N-1 iterations  
            for (int i = 0; i < n - 1; i++) { 
                result = result * (--m); 
            } 
        } else if (isZero == 1 || isFive == 1) { 
            result = 1; 
  
            // Remaining N-1 iterations  
            for (int i = 0; i < n - 1; i++) { 
                result = result * (--m); 
            } 
        } else { 
            result = -1; 
        } 
  
        return result; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int n = 3, m = 6; 
  
        int arr[] = {2, 3, 5, 6, 7, 9}; 
        System.out.println(numbers(n, arr, m)); 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

