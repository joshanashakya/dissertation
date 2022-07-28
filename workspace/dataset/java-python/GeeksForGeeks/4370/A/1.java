

// Java program to reverse an array without 
// using "-" sign 
class GFG { 
  
    // Function to reverse array 
    static void reverseArray(int arr[], int n) 
    { 
        // Trick to assign -1 to a variable 
        int x = (Integer.MIN_VALUE / Integer.MAX_VALUE); 
  
        // Reverse array in simple manner 
        for (int i = 0; i < n / 2; i++) 
  
            // Swap ith index value with (n-i-1)th 
            // index value 
            swap(arr, i, n + (x * i) + x); 
    } 
    static int[] swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
  
    // Drivers code 
    public static void main(String[] args) 
    { 
        int arr[] = { 5, 3, 7, 2, 1, 6 }; 
        int n = arr.length; 
  
        reverseArray(arr, n); 
  
        // print the reversed array 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

