

// Java program to minimize the sum  
// of squares of sum of numbers  
// of N/2 groups of N numbers  
import java.util.Arrays; 
  
class GFG  
{  
  
    // Function that returns the minimize sum  
    // of square of sum of numbers of every group  
    static int findMinimal(int []a, int n)  
    {  
        // Sort the array elements  
        Arrays.sort(a);  
      
        int sum = 0;  
      
        // Iterate for the first half of array  
        for (int i = 0; i < n / 2; i++)  
            sum += (a[i] + a[n - i - 1]) *  
                (a[i] + a[n - i - 1]);  
      
        return sum;  
    }  
      
    // Driver Code  
    public static void main(String str[])  
    {  
        int []a = { 8, 5, 2, 3 };  
        int n = a.length;  
        System.out.println(findMinimal(a, n));  
    }  
}  
  
// This code is contributed by Ryuga 

