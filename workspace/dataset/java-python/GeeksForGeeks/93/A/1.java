

// Java program to Count the number of elements 
// in an array which are divisible by k 
import java.util.*; 
  
class Geeks { 
  
  
// Function to count the elements 
static int CountTheElements(int arr[], int n, int k) 
{ 
    int counter = 0; 
  
    for (int i = 0; i < n; i++) { 
        if (arr[i] % k == 0) 
            counter++; 
    } 
  
    return counter; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 2, 6, 7, 12, 14, 18 }; 
    int n = arr.length; 
    int k = 3; 
  
    System.out.println(CountTheElements(arr, n, k)); 
} 
} 
  
// This code is contributed by ankita_saini 

