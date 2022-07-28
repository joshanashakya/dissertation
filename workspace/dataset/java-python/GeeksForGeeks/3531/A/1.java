

// Java implementaion of the approach 
class GFG 
{ 
      
// Function to return the no. of years 
static float noOfYears(int t1, int n1, int t2) 
{ 
    float years = ((t2 - 1) * n1 / (float)(t1 - 1)); 
  
    return years; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int T1 = 3, N1 = 5, T2 = 6; 
  
    System.out.println(noOfYears(T1, N1, T2)); 
} 
} 
  
// This code is contributed by Code_Mech 

