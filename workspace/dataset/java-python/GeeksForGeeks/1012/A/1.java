

// Program to count number of elements  
// between two given elements. 
import java.io.*; 
  
class GFG  
{ 
    // Function to count number of elements 
    // occurs between the elements. 
    static int getCount(int arr[], int n,  
                            int num1, int num2) 
    { 
        // Find num1 
        int i = 0; 
        for (i = 0; i < n; i++) 
            if (arr[i] == num1) 
                break; 
      
        // If num1 is not present  
        // or present at end 
        if (i >= n - 1) 
            return 0; 
      
        // Find num2 
        int j; 
        for (j = n - 1; j >= i + 1; j--) 
            if (arr[j] == num2) 
                break; 
      
        // If num2 is not present 
        if (j == i) 
            return 0; 
      
        // return number of elements  
        // between the two elements. 
        return (j - i - 1); 
    } 
      
    // Drvier program  
    public static void main (String[] args)  
    { 
        int arr[] = { 3, 5, 7, 6, 4, 9, 12, 4, 8 }; 
        int n = arr.length; 
        int num1 = 5, num2 = 4; 
        System.out.println( getCount(arr, n, num1, num2)); 
  
    } 
} 
// This code is contributed by vt_m 

