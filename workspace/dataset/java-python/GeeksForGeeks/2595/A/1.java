

// Java program to find all those  
// elements of arr1[] that are not 
// present in arr2[] 
  
class GFG 
{ 
    static void relativeComplement(int arr1[], int arr2[], 
                                             int n, int m)  
    { 
      
        int i = 0, j = 0; 
        while (i < n && j < m)  
        { 
          
            // If current element in arr2[] is 
            // greater, then arr1[i] can't be  
            // present in arr2[j..m-1] 
            if (arr1[i] < arr2[j])  
            { 
                System.out.print(arr1[i] + " "); 
                i++; 
          
            // Skipping smaller elements of 
            // arr2[] 
            } else if (arr1[i] > arr2[j])  
            { 
                j++; 
          
            // Equal elements found (skipping 
            // in both arrays) 
            }  
            else if (arr1[i] == arr2[j])  
            { 
                i++; 
                j++; 
            } 
        } 
          
        // Printing remaining elements of 
        // arr1[] 
        while (i < n)  
            System.out.print(arr1[i] + " ");  
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr1[] = {3, 6, 10, 12, 15}; 
        int arr2[] = {1, 3, 5, 10, 16}; 
        int n = arr1.length; 
        int m = arr2.length; 
        relativeComplement(arr1, arr2, n, m); 
     } 
} 
  
// This code is contributed by Anant Agarwal. 

