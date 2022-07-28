

// Java program to check whether the last 
// element of the array is even or odd  
// after performing the operation p times. 
import java.util.*; 
  
class Even_odd{ 
  
    public static String check_last(int arr[], int n, int p) 
    { 
        int sum = 0; 
       
        // sum of the array. 
        for (int i = 0; i < n; i++) 
            sum = sum + arr[i]; 
   
        if (p == 1) { 
       
            // if sum is even 
            if (sum % 2 == 0) 
                return "ODD"; 
            else
                return "EVEN"; 
        }    
        return "EVEN"; 
    } 
      
    public static void main(String[] args) 
    { 
        int arr[] = { 5, 7, 10 }, p = 1; 
        int n = 3; 
        System.out.print(check_last(arr, n, p)); 
    } 
} 
  
//This code is contributed by rishabh_jain 

