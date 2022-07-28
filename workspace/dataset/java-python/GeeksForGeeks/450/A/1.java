

// Java program to find count of all 
// majority elements in a Matrix 
import java.util.*; 
  
class GFG 
{ 
    static int N = 3; // Rows 
    static int M = 3; // Columns 
      
    // Function to find count of all 
    // majority elements in a Matrix 
    static int majorityInMatrix(int arr[][]) 
    { 
      
        HashMap<Integer, Integer> mp =  
                new HashMap<Integer, Integer>(); 
      
        // Store frequency of elements 
        // in matrix 
        for (int i = 0; i < N; i++)  
        { 
            for (int j = 0; j < M; j++)  
            { 
                if(mp.containsKey(arr[i][j])) 
                    mp.put(arr[i][j], mp.get(arr[i][j]) + 1 ); 
                else
                    mp.put(arr[i][j], 1); 
            } 
        } 
      
        // loop to iteratre through map  
        int countMajority = 0; 
          
        Iterator<HashMap.Entry<Integer, Integer>> itr =  
                                mp.entrySet().iterator();  
          
        while(itr.hasNext()) 
        { 
            // check if frequency is greater than 
            // or equal to (N*M)/2 
            HashMap.Entry<Integer, Integer> entry = itr.next(); 
              
            if (entry.getValue() >= ((N * M) / 2))  
            { 
                countMajority++; 
            } 
        } 
      
        return countMajority; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
      
        int mat[][] = { { 1, 2, 2 }, 
                        { 1, 3, 2 }, 
                        { 1, 2, 6 } }; 
      
        System.out.println(majorityInMatrix(mat)); 
    } 
} 
  
// This code is contributed by ihritik 

