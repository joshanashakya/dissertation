

// Java program to find Noble elements 
// in an array. 
import java.util.ArrayList; 
  
class GFG { 
      
    // Returns a Noble integer if present, 
    // else returns -1. 
    public static int nobleInteger(int arr[]) 
    { 
        int size = arr.length; 
        for (int i = 0; i < size; i++ ) 
        { 
            int count = 0; 
            for (int j = 0; j < size; j++) 
                if (arr[i] < arr[j]) 
                    count++; 
  
            // If count of greater elements 
            // is equal to arr[i] 
            if (count == arr[i]) 
                return arr[i]; 
        } 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int [] arr = {10, 3, 20, 40, 2}; 
        int res = nobleInteger(arr); 
        if (res != -1) 
            System.out.println("The noble "
                     + "integer is "+ res); 
        else
            System.out.println("No Noble "
                        + "Integer Found"); 
    } 
} 

