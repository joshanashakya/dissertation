

// Java implementation of the apporach  
class GFG  
{ 
      
    final static int N = 3 ; 
      
    // Function to return the minimum steps  
    // required to convert the given matrix  
    // to a Diagonally Dominant Matrix  
    static int findStepsForDDM(int arr[][])  
    {  
        int result = 0;  
      
        // For each row  
        for (int i = 0; i < N; i++)  
        {  
      
            // To store the sum of the current row  
            int sum = 0;  
            for (int j = 0; j < N; j++)  
                sum += Math.abs(arr[i][j]);  
      
            // Remove the element of the current row  
            // which lies on the main diagonal  
            sum -= Math.abs(arr[i][i]);  
      
            // Checking if the diagonal element is less  
            // than the sum of non-diagonal element  
            // then add their difference to the result  
            if (Math.abs(arr[i][i]) < Math.abs(sum))  
                result += Math.abs(Math.abs(arr[i][i]) - Math.abs(sum));  
        }  
      
        return result;  
    }  
      
    // Driven code  
    public static void main (String[] args)  
    { 
          
        int arr[][] = { { 3, -2, 1 },  
                        { 1, -3, 2 },  
                        { -1, 2, 4 } };  
      
        System.out.println(findStepsForDDM(arr));  
    } 
} 
  
// This code is contributed by AnkitRai01 

