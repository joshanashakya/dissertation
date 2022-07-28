

// Java program to sort all the elements that are  
// perfect squares in their relative positions  
import java.util.*; 
  
class GFG 
{ 
  
// function to sort all the elements that are  
// perfect squares in their relative positions  
static void sortPerfectSquare(int arr[], int n)  
{  
    int a;  
    float b;  
  
    // v1 will contain index of perfect squares  
    // v2 will contain each perfect square  
    Vector<Integer> v1 = new Vector<Integer>(); 
    Vector<Integer> v2 = new Vector<Integer>(); 
  
    for (int i = 0; i < n; i++)  
    {  
        b = (float) Math.sqrt(arr[i]);  
        a = (int) b;  
  
        // if both a and b are equal then  
        // arr[i] is a perfect square  
        if (a == b) 
        {  
            v1.add(i);  
            v2.add(arr[i]);  
        }  
    }  
  
    // sort second vector  
    Collections.sort(v2);  
  
    // put the sorted perfect square  
    // back into the array  
    int j = 0;  
    for (int i = 0; i < n; i++)  
    {  
        if (v1.get(j) == i)  
        {  
            arr[i] = v2.get(j);  
            j++;  
        }  
    }  
  
    // print final array  
    for (int i = 0; i < n; i++) 
            System.out.print(arr[i]+" ");  
}  
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = { 9, 44, 100, 81, 21, 64 };  
        int n = arr.length;  
  
        sortPerfectSquare(arr, n); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

