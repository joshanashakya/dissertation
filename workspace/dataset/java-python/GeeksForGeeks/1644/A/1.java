

// Java program for Split the array into three  
// subarrays such that summation of first  
// and third subarray is equal and maximum  
import java.util.HashMap; 
import java.util.Map; 
  
class GfG 
{ 
  
    // Fucntion to return the sum  
    // of the first subarray  
    static int sumFirst(int a[], int n)  
    {  
        HashMap<Integer, Integer> mp = new HashMap<>();  
        int suf = 0;  
      
        // calculate the suffix sum  
        for (int i = n - 1; i >= 0; i--)  
        {  
            suf += a[i];  
            mp.put(suf, i);  
        }  
      
        int pre = 0, maxi = -1;  
      
        // iterate from beginning  
        for (int i = 0; i < n; i++)  
        {  
      
            // prefix sum  
            pre += a[i];  
      
            // check if it exists beyond i  
            if (mp.containsKey(pre) && mp.get(pre) > i) 
            {  
      
                // if greater then previous  
                // then update maximum  
                if (pre > maxi) 
                {  
                    maxi = pre;  
                }  
            }  
        }  
      
        // First and second subarray empty  
        if (maxi == -1)  
            return 0;  
      
        // partition done  
        else
            return maxi;  
    }  
      
    // Driver code 
    public static void main(String []args) 
    { 
          
        int a[] = { 1, 3, 2, 1, 4 };  
        int n = a.length;  
        System.out.println(sumFirst(a, n)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

