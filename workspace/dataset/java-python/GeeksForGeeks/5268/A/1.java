

// Java implementation of the approach 
import java.util.ArrayList; 
import java.util.Collections; 
  
class GFG { 
  
    // Function that returns true if n is an ugly number 
    static boolean isUgly(int n) 
    { 
        // While divisible by 2, keep dividing 
        while (n % 2 == 0) 
            n = n / 2; 
  
        // While divisible by 3, keep dividing 
        while (n % 3 == 0) 
            n = n / 3; 
  
        // While divisible by 5, keep dividing 
        while (n % 5 == 0) 
            n = n / 5; 
  
        // n must be 1 if it was ugly 
        if (n == 1) 
            return true; 
        return false; 
    } 
  
    // Function to sort ugly numbers 
    // in their relative positions 
    static void sortUglyNumbers(int arr[], int n) 
    { 
  
        // To store the ugly numbers from the array 
        ArrayList<Integer> list = new ArrayList<>(); 
  
        int i; 
        for (i = 0; i < n; i++) { 
  
            // If current element is an ugly number 
            if (isUgly(arr[i])) { 
  
                // Add it to the ArrayList 
                // and set arr[i] to -1 
                list.add(arr[i]); 
                arr[i] = -1; 
            } 
        } 
  
        // Sort the ugly numbers 
        Collections.sort(list); 
  
        int j = 0; 
        for (i = 0; i < n; i++) { 
  
            // Position of an ugly number 
            if (arr[i] == -1) 
                System.out.print(list.get(j++) + " "); 
            else
                System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 7, 12, 10 }; 
        int n = arr.length; 
        sortUglyNumbers(arr, n); 
    } 
} 

