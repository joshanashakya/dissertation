

// Java program to reduce the array 
// such that each element appears 
// at most K times 
import java.util.*; 
  
class GFG{ 
   
// Function to reduce the array 
static void reduceArray(int arr[], int n, int K) 
{ 
    // Vector to store the reduced array 
    Vector<Integer> vec = new Vector<Integer>(); 
    int size = 0; 
    int curr_ele = arr[0], curr_freq = 1; 
   
    // Iterate over the array 
    for (int i = 0; i < n; i++) { 
   
        if (curr_ele == arr[i] 
            && curr_freq <= K) { 
            vec.add(arr[i]); 
            size++; 
        } 
        else if (curr_ele != arr[i]) { 
            curr_ele = arr[i]; 
            vec.add(arr[i]); 
            size++; 
            curr_freq = 1; 
        } 
        curr_freq++; 
    } 
   
    // Print the reduced array 
    System.out.print("{"); 
    for (int i = 0; i < size; i++) { 
        System.out.print(vec.get(i)+ ", "); 
    } 
    System.out.print("}"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] 
        = { 1, 1, 1, 2, 
            2, 2, 3, 3, 
            3, 3, 3, 3, 
            4, 5 }; 
   
    int n = arr.length; 
    int K = 2; 
   
    // Function call 
    reduceArray(arr, n, K); 
   
} 
} 
  
// This code is contributed by PrinciRaj1992 

