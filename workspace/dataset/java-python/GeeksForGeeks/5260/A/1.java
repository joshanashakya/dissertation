

// Java program for above implementation 
class GFG  
{ 
  
    // Function to find the largest number 
    static int largestNum(int a, int b)  
    { 
        return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0); 
    } 
  
    // Drivers code 
    public static void main(String[] args)  
    { 
        int a = 22, b = 1231; 
        System.out.print(largestNum(a, b)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

