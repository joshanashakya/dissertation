

// Java implementation of the approach 
class GFG { 
  
    // Function to return the number of 
    // pairs (x, y) such that x < y 
    static int getPairs(int a[]) 
    { 
        // To store the number of valid pairs 
        int count = 0; 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a.length; j++) { 
  
                // If a valid pair is found 
                if (a[i] < a[j]) 
                    count++; 
            } 
        } 
  
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

