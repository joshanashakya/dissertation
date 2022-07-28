

// Java implementation of above apporach 
class GFG 
{ 
      
    static int N = 4; 
      
    // Function to count steps in 
    // conversion of matrix into upper 
    // Hessenberg matrix 
    static int stepsRequired(int arr[][]) 
    { 
        int result = 0; 
        for (int i = 0; i < N; i++) 
        { 
      
            for (int j = 0; j < N; j++) 
            { 
      
                // if element is below sub-diagonal 
                // add abs(element) into result 
                if (i > j + 1) 
                    result += Math.abs(arr[i][j]); 
            } 
        } 
        return result; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
          
        int arr [][] = new int [][] {{1, 2, 3, 4}, 
                        {3, 1, 0, 3}, 
                        {3, 2, 1, 3}, 
                        {-3, 4, 2, 1 }}; 
      
        // Function call 
        System.out.println(stepsRequired(arr)); 
    } 
} 
  
// This code is contributed by ihritik 

