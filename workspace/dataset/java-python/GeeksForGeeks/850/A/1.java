

// Java implementation of the approach  
class GFG 
{ 
  
    // Utility function to print 
    // the contents of an array 
    public static void printArr(int[] arr, int n)  
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i]); 
    } 
  
    // A comparison function that return negative 
    // if 'AB' is smaller than 'BA' when 
    // we concatenate two numbers 'A' and 'B' 
    // For example, it will return negative value if 
    // we pass 12 and 24 as arguments. 
    // This function will be used during sort 
    public static int compare(int num1, int num2) 
    { 
  
        // toString function is predefined function 
        // to convert a number in string 
  
        // Convert first number to string format 
        String A = Integer.toString(num1); 
  
        // Convert second number to string format 
        String B = Integer.toString(num2); 
          
        // Check if 'AB' is smaller or 'BA' 
        // and return integer value 
        return (A+B).compareTo(B+A); 
    } 
  
    // Function to print the arrangement 
    // with the smallest value 
    public static void printSmallest(int N, int[] arr)  
    { 
  
        // Sort using compare function which 
        // is defined above 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = i + 1; j < N; j++) 
            { 
                if (compare(arr[i], arr[j]) > 0) 
                { 
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
            } 
        } 
  
        // Print the sorted array 
        printArr(arr, N); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] arr = { 5, 6, 2, 9, 21, 1 }; 
        int N = arr.length; 
        printSmallest(N, arr); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

