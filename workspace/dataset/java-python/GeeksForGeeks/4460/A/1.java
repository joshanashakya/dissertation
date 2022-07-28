

// Java program to pick a value among two 
// according to value of a third variable. 
class GFG { 
  
    // Returns a if x is 0 and returns 
    // b if x is 1. 
    static int assignValue(int a, int b, int x) 
    { 
        int arr[] = {a, b}; 
  
        return (arr[x]); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int y = assignValue(3, 7, 0); 
        System.out.println(y); 
    } 
} 
  
// This code is contributed by  Smitha Dinesh Semwal. 

