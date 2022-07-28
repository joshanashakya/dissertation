

// Java program to find the ratio of the distance 
// between the centers of the circles 
// and the point of intersection of 
// two direct common tangents to the circles 
// which do not touch each other 
class GFG { 
  
    // Function to find the GCD 
    static int GCD(int a, int b) 
    { 
        return (b != 0 ? GCD(b, a % b) : a); 
    } 
  
    // Function to find the ratio 
    static void ratiotang(int r1, int r2) 
    { 
        System.out.println("The ratio is "
                           + r1 / GCD(r1, r2) 
                           + " : "
                           + r2 / GCD(r1, r2)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int r1 = 4, r2 = 6; 
        ratiotang(r1, r2); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

