

// Java implementation of above approach  
import java.util.*; 
  
class GFG 
{ 
    static class pair 
    { 
        int first, second; 
        public pair(int first, int second) 
        { 
            this.first = first; 
            this.second = second; 
        } 
    } 
      
    // Function to return the total pairs  
    // of elements whose modulo yield K  
    static int totalPairs(int []arr1, int []arr2, 
                          int K, int n, int m)  
    {  
      
        // set is used to avoid duplicate pairs  
        HashSet<pair> s = new HashSet<pair>();  
      
        for (int i = 0; i < n; i++)  
        {  
            for (int j = 0; j < m; j++)  
            {  
      
                // check which element is greater and  
                // proceed according to it  
                if (arr1[i] > arr2[j])  
                {  
      
                    // check if modulo is equal to K  
                    if (arr1[i] % arr2[j] == K)  
                        s.add(new pair(arr1[i], arr2[j]));  
                }  
                else
                {  
                    if (arr2[j] % arr1[i] == K)  
                        s.add(new pair(arr2[j], arr1[i]));  
                }  
            }  
        }  
      
        // return size of the set  
        return s.size();  
    }  
      
    // Driver code  
    public static void main(String []args)  
    {  
        int []arr1 = { 8, 3, 7, 50 };  
        int []arr2 = { 5, 1, 10, 4 };  
        int K = 3;  
        int n = arr1.length;  
        int m = arr2.length; 
      
        System.out.println(totalPairs(arr1, arr2, K, n, m));  
    }  
} 
  
// This code is contributed by Princi Singh 

