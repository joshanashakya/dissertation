

// Java implementation of the approach  
import java.util.*;  
import java.io.*;  
import java.lang.*;  
  
class GFG  
{  
  
static int log2(int N)  
{  
    // calculate log2 N indirectly  
    // using log() method  
    int result = (int)(Math.log(N) / Math.log(2));  
  
    return result;  
} 
  
// Function to return the number formed  
// by inverting bits the bits of num  
static int invertBits(int num)  
{  
    // Number of bits in num  
    int x = log2(num) + 1;  
  
    // Inverting the bits one by one  
    for (int i = 0; i < x; i++)  
        num = (num ^ (1 << i));  
  
    return num;  
}  
  
// Function to return the total valid pairs  
static int totalPairs(int arr1[], int arr2[], int n, int m)  
{  
  
    // Set to store the elements of the arrays  
    HashSet<Integer> s1 = new HashSet<Integer>();  
    HashSet<Integer> s2 = new HashSet<Integer>();  
  
    // add all the elements of arr2[] in the set  
    for (int i = 0; i < m; i++)  
        s2.add(arr2[i]);  
  
    // Initialize count variable to 0  
    int count = 0;  
    for (int i = 0; i < n; i++) 
    {  
  
        // Check if element of the first array  
        // is not in the first set  
        if (!s1.contains(arr1[i]))  
        {  
  
            // Check if the element formed by inverting bits  
            // is in the second set  
            if (s2.contains(invertBits(arr1[i]))) 
            {  
  
                // Increment the count of valid pairs and add  
                // the element in the first set so that  
                // it doesn't get counted again  
                count++;  
                s1.add(arr1[i]);  
            }  
        }  
    }  
  
    // Return the total number of pairs  
    return count;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr1[] = { 43, 7, 1, 99 };  
    int arr2[] = { 5, 1, 28, 20 };  
    int n = arr1.length;  
    int m = arr2.length;  
  
    System.out.println(totalPairs(arr1, arr2, n, m));  
}  
} 
  
// This code is contributed by SHUBHAMSINGH10 

