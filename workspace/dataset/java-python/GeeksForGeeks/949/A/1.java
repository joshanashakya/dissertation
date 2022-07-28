

// Java program to print the number of subarrays such  
// that all elements are greater than K  
  
import java.io.*; 
  
class GFG { 
      
// Function to count number of subarrays  
static int countSubarrays(int a[], int n, int x)  
{  
    int count = 0;  
  
    int number = 0;  
  
    // Iterate in the array  
    for (int i = 0; i < n; i++) {  
  
        // check if array element  
        // greater then X or not  
        if (a[i] > x) {  
            count += 1;  
        }  
        else {  
  
            number += (count) * (count + 1) / 2;  
            count = 0;  
        }  
    }  
  
    // After iteration complete  
    // check for the last set of subarrays  
    if (count!=0)  
        number += (count) * (count + 1) / 2;  
  
    return number;  
}  
  
// Driver Code  
    public static void main (String[] args) { 
        int a[] = { 3, 4, 5, 6, 7, 2, 10, 11 };  
        int n = a.length;  
        int k = 5;  
  
        System.out.println (countSubarrays(a, n, k));  
          
    } 
} 

