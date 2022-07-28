

// Java program to implement above approach 
class GFG 
{ 
      
    // Function to print the array elements 
    static void printArray(int N, int arr[]) 
    { 
        for (int i = 0; i < N; i++) 
            System.out.print(arr[i] + " "); 
      
        System.out.println(); 
    } 
      
    // Function to replace all elements with absolute 
    // difference of absolute sums of positive 
    // and negatve elements 
    static void replacedArray(int N, int arr[]) 
    { 
        int pos_sum, neg_sum, i, j, diff; 
      
        pos_sum = 0; 
        neg_sum = 0; 
      
        for (i = N - 1; i >= 0; i--) 
        { 
      
            // calculate differenbce of both sums 
            diff = Math.abs(pos_sum) - Math.abs(neg_sum); 
      
            // if i-th element is positive, 
            // add it to positive sum 
            if (arr[i] > 0) 
                pos_sum += arr[i]; 
      
            // if i-th element is negative, 
            // add it to negative sum 
            else
                neg_sum += arr[i]; 
      
            // replace i-th elements with 
            // absolute difference 
            arr[i] = Math.abs(diff); 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int N = 5; 
        int arr[] = { 1, -1, 2, 3, -2 }; 
        replacedArray(N, arr); 
        printArray(N, arr); 
      
        N = 6; 
        int arr1[] = { -3, -4, -2, 5, 1, -2 }; 
        replacedArray(N, arr1); 
        printArray(N, arr1); 
    } 
} 
  
// This code is contributed by ihritik 

