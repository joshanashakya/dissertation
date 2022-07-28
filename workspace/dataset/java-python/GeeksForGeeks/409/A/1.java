

// Java program to count minimum number of partitions 
// of size 2 and sum smaller than or equal to given 
// key. 
  
import java.util.Arrays;  
class GFG { 
  
  
static int minimumSets(int arr[], int n, int key) 
{ 
    int i, j; 
  
    // sort the array 
    Arrays.sort(arr); 
  
    // if sum of ith smaller and jth larger element is 
    // less than key, then pack both numbers in a set  
    // otherwise pack the jth larger number 
    // alone in the set 
    for (i = 0, j = n - 1; i <= j; ++i) 
        if (arr[i] + arr[j] <= key) 
            j--; 
  
    // After ending of loop i will contain minimum 
    // number of sets 
    return i; 
} 
  
  
  
    public static void main (String[] args) { 
    int []arr = { 3, 5, 3, 4 }; 
    int n =arr.length; 
    int key = 5; 
    System.out.println( minimumSets(arr, n, key)); 
    } 
} 
// This code is contributed by chandan_jnu. 

