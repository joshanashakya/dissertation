

// Java program to find an  
// element which divides the 
// array in two sub-arrays  
// with equal product. 
class GFG 
{ 
  
// Function to 
// compute partition 
static int findElement(int arr[],  
                       int size) 
{ 
    int right_mul = 1,  
        left_mul = 1; 
  
    // Computing right_sum 
    for (int i = 1; i < size; i++) 
        right_mul *= arr[i]; 
  
    // Checking the point of 
    // partition i.e. left_Sum  
    // == right_sum 
    for (int i = 0, j = 1;  
             j < size; i++, j++)  
    { 
        right_mul /= arr[j]; 
        left_mul *= arr[i]; 
  
        if (left_mul == right_mul) 
            return arr[i + 1]; 
    } 
  
    return -1; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int arr[] = {2, 3, 4, 1, 4, 6}; 
    int size = arr.length; 
    System.out.println(findElement(arr,  
                                   size)); 
} 
} 
// This code is contributed  
// by Arnab Kundu 

