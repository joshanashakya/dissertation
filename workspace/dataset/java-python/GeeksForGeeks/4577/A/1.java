

// Java program to count number of  
// subarrays with XOR less than k  
  
import java.io.*; 
  
class GFG { 
      
// function to count number of  
// subarrays with XOR less than k  
static int xorLessK(int arr[], int n, int k)  
{  
    int count = 0;  
  
    // check all subarrays  
    for (int i = 0; i < n; i++) {  
        int tempXor = 0;  
        for (int j = i; j < n; j++) {  
            tempXor ^= arr[j];  
            if (tempXor < k)  
                count++;  
        }  
    }  
  
    return count;  
}  
  
// Driver program to test above function  
    public static void main (String[] args) { 
  
          
    int k = 3;  
    int arr[] = new int[] { 8, 9, 10, 11, 12 };  
    int n = arr.length;  
  
    System.out.println(xorLessK(arr, n, k));  
          
    } 
} 

