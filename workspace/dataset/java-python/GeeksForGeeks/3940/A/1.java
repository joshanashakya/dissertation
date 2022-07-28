

// Java implementation of the approach 
  
class GFG 
{ 
    // Function to return the count 
    // of maximum teams possible 
    static int maxTeams(int N1, int N2) 
    { 
      
        int count = 0; 
      
        // While it is possible to form a team 
        while (N1 > 0 && N2 > 0 && N1 + N2 >= 3) { 
      
            // Choose 2 memebers from group 1 
            // and a single memeber from group 2 
            if (N1 > N2) { 
                N1 -= 2; 
                N2 -= 1; 
            } 
      
            // Choose 2 memebers from group 2 
            // and a single memeber from group 1 
            else { 
                N1 -= 1; 
                N2 -= 2; 
            } 
      
            // Update the count 
            count++; 
        } 
      
        // Return the count 
        return count; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
      
        int N1 = 4, N2 = 5; 
        System.out.println(maxTeams(N1, N2)); 
      
          
    } 
  
} 
  
// This code is contributed by ihritik 

