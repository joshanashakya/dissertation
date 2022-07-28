

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// function to prin the odd and even indexed digits 
static void odd_even(int arr[], int n) 
{ 
      
    // lists to store the odd and 
    // even positioned digits 
    Vector<Integer> odd_indexes = new Vector<Integer>(); 
    Vector<Integer> even_indexes = new Vector<Integer>(); 
      
    // traverse through all the indexes  
    // in the integer 
    for (int i = 0; i < n;i++) 
    { 
  
        // if the digit is in odd_index position 
        // append it to odd_position list 
        if (i % 2 == 0) 
            odd_indexes.add(arr[i]); 
          
        // else append it to the even_position list 
        else
            even_indexes.add(arr[i]); 
  
    } 
          
    // print the elements in the list in sorted order 
    Collections.sort(odd_indexes); 
    Collections.sort(even_indexes); 
      
    for(int i = 0; i < odd_indexes.size(); i++) 
        System.out.print(odd_indexes.get(i) + " "); 
  
    for(int i = 0; i < even_indexes.size(); i++) 
        System.out.print(even_indexes.get(i) + " ");  
      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = {3, 2, 7, 6, 8}; 
    int n = arr.length; 
    odd_even(arr, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

