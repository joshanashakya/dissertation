

// Java program to shuffle an array in 
// the form of a1, b1, a2, b2,... 
import java.io.*; 
  
class GFG { 
  
  // function to rearrange the array 
  public static void rearrange(int[] arr) { 
  
    // if size is null or odd return because it 
    // is not possible to rearrange 
    if (arr == null || arr.length % 2 == 1) 
      return; 
  
    // start from the middle index 
    int currIdx = (arr.length - 1) / 2; 
  
    // each time we will set two elements from the  
    // start to the valid position by swapping 
    while (currIdx > 0) { 
      int count = currIdx, swapIdx = currIdx; 
  
      while (count-- > 0) { 
        int temp = arr[swapIdx + 1]; 
        arr[swapIdx + 1] = arr[swapIdx]; 
        arr[swapIdx] = temp; 
        swapIdx++; 
      } 
      currIdx--; 
    } 
  } 
  
  public static void main(String[] args) { 
    int arr[] = {1, 3, 5, 2, 4, 6}; 
    rearrange(arr); 
    for (int i = 0; i < arr.length; i++) 
      System.out.print(" " + arr[i]); 
  } 
} 

