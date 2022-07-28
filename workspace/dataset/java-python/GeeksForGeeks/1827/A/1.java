

// Java program to find n-th number in a series 
// made of digits 3 and 5 
  
class FindNth { 
    // Function to find n-th number in series 
    // made of 3 and 5 
    static int printNthElement(int n) 
    { 
        // create an array of size (n+1) 
        int arr[] = new int[n + 1]; 
        arr[1] = 3; 
        arr[2] = 5; 
  
        for (int i = 3; i <= n; i++) { 
            // If i is odd 
            if (i % 2 != 0) 
                arr[i] = arr[i / 2] * 10 + 3; 
            else
                arr[i] = arr[(i / 2) - 1] * 10 + 5; 
        } 
        return arr[n]; 
    } 
  
    // main function 
    public static void main(String[] args) 
    { 
        int n = 6; 
  
        System.out.println(printNthElement(n)); 
    } 
} 

