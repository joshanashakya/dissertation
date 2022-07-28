

// Java code to sort an array of Strings 
// with the help of single loop 
  
import java.util.*; 
  
class Geeks_For_Geeks { 
  
    // Function for Sorting the array using a single loop 
    public static char[] sortArrays(char[] arr) 
    { 
  
        // Finding the length of array 'arr' 
        int length = arr.length; 
  
        // Sorting using a single loop 
        for (int j = 0; j < arr.length - 1; j++) { 
  
            // Type Conversion of char to int. 
            int d1 = arr[j]; 
            int d2 = arr[j + 1]; 
  
            // Comparing the ascii code. 
            if (d1 > d2) { 
  
                // Swapping of the characters 
                char temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
                j = -1; 
            } 
        } 
  
        return arr; 
    } 
  
    // Declaring main method 
    public static void main(String args[]) 
    { 
  
        // Declaring a String 
        String geeks = "GEEKSFORGEEKS"; 
  
        // Declaring a character array 
        // to store characters of geeks in it. 
        char arr[] = geeks.toCharArray(); 
  
        // Printing the original Array. 
        System.out.println("Original array: "
                           + Arrays.toString(arr)); 
  
        // Sorting the array using a single loop 
        arr = sortArrays(arr); 
  
        // Printing the sorted array. 
        System.out.println("Sorted array: "
                           + Arrays.toString(arr)); 
    } 
} 

