

// Java implementation of the approach  
public class GFG{ 
  
    // Function that returns true if the the sum of all the  
    // perfect squares of the given array is divisible by x  
    static boolean check(int arr[], int x, int n)  
    {  
        long sum = 0;  
        for (int i = 0; i < n; i++) {  
            double y = Math.sqrt(arr[i]);  
      
            // If arr[i] is a perfect square  
            if (Math.floor(y) == Math.ceil(y)) {  
                sum += arr[i];  
            }  
        }  
      
        if (sum % x == 0)  
            return true;  
        else
            return false;  
    }  
  
  
  
    // Driver Code  
    public static void main(String []args){ 
        int arr[] = { 2, 3, 4, 9, 10 };  
        int n = arr.length ; 
        int x = 13;  
  
        if (check(arr, x, n)) {  
            System.out.println("Yes");  
        }  
        else {  
           System.out.println("No");  
        }  
    } 
    // This code is contributed by Ryuga 
} 

