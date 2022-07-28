

// Java program to count unique rectangles in a chessboard 
class Rectangle { 
  
    // Function to count distinct rectangles 
    static int count(int N) 
    { 
        int a = 0; 
  
        a = (N * (N + 1)) / 2; 
  
        return a; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.print(count(n));  
    } 
} 

