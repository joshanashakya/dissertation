

//Java implementation of the above approach  
import java.util.*; 
class Solution 
{ 
static final int MAX=10000;  
  
static int hashTable[]= new int[MAX];  
  
// function to find minimum operations  
static int minOperations(int arr[], int n)  
{  
    // sort array  
    Arrays.sort(arr);  
  
    // prepare hash of array  
    for (int i = 0; i < n; i++)  
        hashTable[arr[i]]++;  
  
    int res = 0;  
    for (int i = 0; i < n; i++) {  
        if (hashTable[arr[i]]!=0) {  
            for (int j = i; j < n; j++)  
                if (arr[j] % arr[i] == 0)  
                    hashTable[arr[j]] = 0;  
            res++;  
        }  
    }  
  
    return res;  
}  
  
// Driver program  
public static void main(String args[])  
{  
    int arr[] = { 4, 6, 2, 8, 7, 21, 24, 49, 44 };  
    int n = arr.length;  
  
    System.out.print( minOperations(arr, n));  
   
}  
} 
// This code is contributed by Arnab Kundu 

