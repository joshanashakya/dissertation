

// Java program to find sum of all max  
// frequency elements in a Matrix  
import java.util.*; 
  
class GFG 
{ 
  
    static int N = 3; // Rows  
    static int M = 3; // Columns  
  
    // Function to find sum of all max  
    // frequency elements in a Matrix  
    static int sumMaxOccurring(int arr[][]) 
    { 
        // Store frequencies of elements  
        // in matrix  
        Map<Integer, Integer> mp = new HashMap<>(); 
        for (int i = 0; i < N; i++)  
        { 
            for (int j = 0; j < M; j++) 
            { 
                if (mp.containsKey(arr[i][j]))  
                { 
                    mp.put(arr[i][j], mp.get(arr[i][j]) + 1); 
                } 
                else
                { 
                    mp.put(arr[i][j], 1); 
                } 
            } 
        } 
  
        // loop to iterate through map  
        // and find the maximum frequency  
        int sum = 0; 
        int maxFreq = Integer.MIN_VALUE; 
        for (Map.Entry<Integer, Integer> itr : mp.entrySet())  
        { 
            if (itr.getValue() > maxFreq) 
            { 
                maxFreq = itr.getValue(); 
            } 
        } 
  
        // Sum of maximum frequency elements  
        for (Map.Entry<Integer, Integer> itr : mp.entrySet())  
        { 
            if (itr.getValue() == maxFreq) 
            { 
                sum += (itr.getKey()) * (itr.getValue()); 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver Code  
    public static void main(String[] args)  
    { 
        int mat[][] = {{1, 2, 3}, 
                        {1, 3, 2}, 
                        {1, 5, 6}}; 
  
        System.out.println(sumMaxOccurring(mat)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

