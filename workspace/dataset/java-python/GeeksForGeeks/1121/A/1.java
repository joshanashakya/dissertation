

import java.util.Arrays; 
  
// Java program to find minimum value that can  
// be assigned to along elements so that product  
// becomes greater than current product. 
class GFG1 { 
  
    static long findMinValue(long arr[], int n) { 
        // sort the array to apply Binary search  
        Arrays.sort(arr); 
  
        // using log property add every logarithmic  
        // value of element to val  
        double val = 0; // where double is long double  
        for (int i = 0; i < n; i++) { 
            val += (double) (Math.log((double) (arr[i]))); 
        } 
  
        // set left and right extremities to find  
        // min value  
        long left = arr[0], right = arr[n - 1]; 
  
        long ans = 0; 
        while (left <= right) { 
            long mid = (left + right) / 2; 
  
            // multiplying n to mid, to find the  
            // correct min value  
            double temp = (double) n * (double) (Math.log((double) (mid))); 
            if (val < temp) { 
                ans = mid; 
                right = mid - 1; 
            } else { 
                left = mid + 1; 
            } 
        } 
        return ans; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
  
        long arr[] = {4, 2, 1, 10, 6}; 
        int n = arr.length; 
        System.out.println(findMinValue(arr, n)); 
  
    } 
} 
//This code is contributed by 29AjayKumar 

