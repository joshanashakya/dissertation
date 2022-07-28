

// Java implementation of the approach 
class GFG { 
  
    // Function to return the number of 
    // pairs (x, y) such that x < y 
    static int getPairs(int a[]) 
    { 
        // Length of the array 
        int n = a.length; 
  
        // Calculate the number of valid pairs 
        int count = (n * (n - 1)) / 2; 
  
        // Return the count of valid pairs 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 2, 4, 3, 1 }; 
        System.out.println(getPairs(a)); 
    } 
} 

