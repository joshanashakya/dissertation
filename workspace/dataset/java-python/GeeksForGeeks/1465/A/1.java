

// Java program to rearrange positive and  
// negative numbers without comparison  
// with 0. 
import java.util.*; 
  
class GFG  
{ 
      
static boolean oppositeSigns(int x, int y) 
{ 
    return ((x ^ y) < 0); 
} 
  
static void partitionNegPos(int arr[], int n) 
{ 
    Vector<Integer> a = new Vector<Integer>(); 
    Vector<Integer> b = new Vector<Integer>(); 
  
    // Push first element to a.  
    a.add(arr[0]); 
  
    // Now put all elements of same sign 
    // in a[] and opposite sign in b[] 
    for (int i = 1; i < n; i++)  
    { 
        if (oppositeSigns(a.get(0), arr[i])) 
            b.add(arr[i]); 
        else
            a.add(arr[i]); 
    } 
  
    // Print a[] and b[] 
    for (int i = 0; i < a.size(); i++) 
        System.out.print(a.get(i) + " "); 
    System.out.println(""); 
    for (int i = 0; i < b.size(); i++) 
        System.out.print(b.get(i) + " "); 
} 
  
public static void main(String[] args)  
{ 
    int arr[] = { 1, -2, 6, -7, 8 }; 
    int n = arr.length; 
    partitionNegPos(arr, n); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

