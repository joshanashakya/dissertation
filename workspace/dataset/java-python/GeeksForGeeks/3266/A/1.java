

// Java program to find 
// the N-th term in the series 
// 1, 2, 11, 12, 21... 
  
class FindNth { 
  
    // Function to find n-th number in series 
    static int printNthElement(int n) 
    { 
        // create an array of size (n+1) 
        int arr[] = new int[n + 1]; 
        arr[1] = 1; 
        arr[2] = 2; 
  
        for (int i = 3; i <= n; i++) { 
            // If i is odd 
            if (i % 2 != 0) 
                arr[i] = arr[i / 2] * 10 + 1; 
            else
                arr[i] = arr[(i / 2) - 1] * 10 + 2; 
        } 
        return arr[n]; 
    } 
  
    // main function 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        System.out.println(printNthElement(n)); 
    } 
} 

