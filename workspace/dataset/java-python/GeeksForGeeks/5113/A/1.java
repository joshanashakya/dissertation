

// Brute force solution to find out maximum  
// perimeter triangle which can be formed  
// using the elements of the given array 
import java.io.*; 
  
class GFG { 
  
    // Function to find out maximum perimeter 
    static void maxPerimeter(int arr[], int n) 
    { 
      
        // initialize maximum perimeter as 0. 
        int maxi = 0; 
      
        // pick up 3 different elements 
        // from the array. 
        for (int i = 0; i < n - 2; i++) 
        { 
            for (int j = i + 1; j < n - 1; j++) 
            { 
                for (int k = j + 1; k < n; k++)  
                { 
      
                    // a, b, c are 3 sides of 
                    // the triangle 
                    int a = arr[i]; 
                    int b = arr[j]; 
                    int c = arr[k]; 
      
                    // check whether a, b, c  
                    // forms a triangle or not. 
                    if (a < b+c && b < c+a && c < a+b) 
                    { 
      
                        // if it forms a triangle 
                        // then update the maximum  
                        // value. 
                        maxi = Math.max(maxi, a+b+c); 
                    } 
                } 
            } 
        } 
      
        // If maximum perimeter is non-zero 
        // then print it. 
        if (maxi > 0)  
        System.out.println( "Maximum Perimeter is: "
                                             + maxi); 
      
        // otherwise no triangle formation 
        // is possible. 
        else
        System.out.println( "Triangle formation "
                              + "is not possible." ); 
    } 
      
    // Driver Program 
    public static void main (String[] args) 
    { 
          
        // test case 1 
        int arr1[] = {6, 1, 6, 5, 8, 4}; 
        maxPerimeter(arr1, 6); 
      
        // test case 2 
        int arr2[] = {2, 20, 7, 55, 1, 33, 12, 4}; 
        maxPerimeter(arr2, 8); 
      
        // test case 3 
        int arr3[] = {33, 6, 20, 1, 8, 
                                12, 5, 55, 4, 9}; 
        maxPerimeter(arr3, 10); 
    } 
} 
  
// This code is contributed by anuj_67. 

