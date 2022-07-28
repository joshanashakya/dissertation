

// Java implementation of the approach  
class GFG 
{ 
    static final long MAX = 1000000000;  
      
    // Function to find the traingle  
    // with area = (S / 2)  
    static void findTriangle(long S)  
    {  
      
        // Fix the two pairs of coordinates  
        long X1 = 0, Y1 = 0;  
        long X2 = MAX, Y2 = 1;  
      
        // Find (X3, Y3) with integer coordinates  
        long X3 = (MAX - S % MAX) % MAX;  
        long Y3 = (S + X3) / MAX;  
      
        System.out.println("(" + X1 +  
                           ", " + Y1 + ")");  
        System.out.println("(" + X2 +  
                           ", " + Y2 + ")");  
        System.out.println("(" + X3 +  
                           ", " + Y3 + ")");  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        long S = 4;  
      
        findTriangle(S);  
    }  
} 
  
// This code is contributed by AnkitRai01 

