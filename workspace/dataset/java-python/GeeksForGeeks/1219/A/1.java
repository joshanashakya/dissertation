

// Java implementation of the approach 
class GFG 
{ 
    static double PI = 3.14; 
  
    // Function to return the area 
    // of the bigger circle 
    static double find_area(int r, int d)  
    { 
        // Find the radius of 
        // the bigger circle 
        double R = d / PI; 
        R += Math.pow(r, 2); 
        R = Math.sqrt(R); 
  
        // Calculate the area of 
        // the bigger circle 
        double area = PI * Math.pow(R, 2); 
        return area; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int r = 4, d = 5; 
  
        System.out.println(find_area(r, d)); 
    } 
} 
  
// This code is contributed by PrinciRaj1992  

