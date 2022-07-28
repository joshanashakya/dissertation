

// Java program to demonstrate descending order  
// stable sort using greater<>(). 
import java.util.*; 
  
class GFG  
{ 
    static void reverse(int a[])  
    {  
        int i, k, n = a.length;  
        int t; 
        for (i = 0; i < n / 2; i++) 
        {  
            t = a[i];  
            a[i] = a[n - i - 1];  
            a[n - i - 1] = t;  
        }  
    } 
      
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0}; 
        int n = arr.length; 
  
        Arrays.sort(arr); 
        reverse(arr); 
  
        System.out.println("Array after sorting : \n"); 
        for (int i = 0; i < n; ++i) 
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
}  
  
// This code has been contributed by 29AjayKumar 

