

// Java program to find maximum value (a[i]+i)* 
// (a[j]+j) in an array of integers. maxval()  
// returns maximum value of (a[i]+i)*(a[j]+j) 
// where i is not equal to j 
  
public class GFG { 
// Python  
  
    static int maxval(int a[], int n) { 
  
        // at-least there must be two elements  
        // in array 
        if (n < 2) { 
            return -99999; 
        } 
  
        // calculate maximum value 
        int max = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
                int x = (a[i] + i) * (a[j] + j); 
                if (max < x) { 
                    max = x; 
                } 
            } 
        } 
  
        return max; 
    } 
// test the function 
  
    public static void main(String args[]) { 
        int arr[] = {4, 5, 3, 1, 10}; 
        int len = arr.length; 
        System.out.println(maxval(arr, len)); 
  
    } 
} 
  
/*This code is contributed by 29AjayKumar*/

