

// Java program to find the product of all 
// non- repeated elements in an array 
import java.util.HashSet; 
  
class GFG  
{ 
  
    // Function to find the product of all 
    // non-repeated elements in an array 
    static int findProduct(int arr[], int n) 
    { 
        int prod = 1; 
  
        // Hash to store all element of array 
        HashSet<Integer> s = new HashSet<>(); 
        for (int i = 0; i < n; i++)  
        { 
            if (!s.contains(arr[i]))  
            { 
                prod *= arr[i]; 
                s.add(arr[i]); 
            } 
        } 
  
        return prod; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
        int n = arr.length; 
  
        System.out.println(findProduct(arr, n)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

