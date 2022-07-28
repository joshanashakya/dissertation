

// Efficient solution to find  
// out maximum perimeter triangle which  
// can be formed using the elements  
// of the given array  
  
import java.util.Arrays; 
  
class GFG { 
  
// Function to find out maximum perimeter  
    static void maxPerimeter(int arr[], int n) { 
  
        // sort the array elements  
        // in reversed order  
        arr = arrRevSort(arr); 
        //sort(arr, arr+n, greater<int>());  
  
        // initialize maximum  
        // perimeter to 0  
        int maxi = 0; 
  
        // loop through the sorted array  
        // and check whether it forms a  
        // triangle or not.  
        for (int i = 0; i < n - 2; i++) { 
  
            // Check whether arr[i], arr[i+1]  
            // and arr[i+2] forms a triangle  
            // or not.  
            if (arr[i] < arr[i + 1] + arr[i + 2]) { 
  
                // if it forms a triangle then  
                // it is the triangle with  
                // maximum perimeter.  
                maxi = Math.max(maxi, arr[i] + arr[i + 1] + arr[i + 2]); 
                break; 
            } 
        } 
  
        // If maximum perimeter is non-zero  
        // then print it.  
        if (maxi > 0) { 
            System.out.println("Maximum Perimeter is: " + maxi); 
        } // otherwise no triangle formation  
        // is possible.  
        else { 
            System.out.println("Triangle formation is not possible."); 
        } 
    } 
    //Function return sorted array in Decreasing  
  
    static int[] arrRevSort(int[] arr) { 
        Arrays.sort(arr, 0, arr.length); 
        int j = arr.length - 1; 
        for (int i = 0; i < arr.length / 2; i++, j--) { 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
        return arr; 
    } 
  
// Driver Program  
    public static void main(String[] args) { 
        // test case 1  
        int arr1[] = {6, 1, 6, 5, 8, 4}; 
        maxPerimeter(arr1, 6); 
  
        // test case 2  
        int arr2[] = {2, 20, 7, 55, 1, 33, 12, 4}; 
        maxPerimeter(arr2, 8); 
  
        // test case 3  
        int arr3[] = {33, 6, 20, 1, 8, 12, 5, 55, 4, 9}; 
        maxPerimeter(arr3, 10); 
    } 
} 
/*This Java code is contributed by 29AjayKumar*/

