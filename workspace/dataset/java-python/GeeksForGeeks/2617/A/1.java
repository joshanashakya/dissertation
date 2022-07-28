

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function to print the pair that gives maximum nCr  
static void printMaxValPair(Vector<Long> v, int n)  
{  
    Collections.sort(v);  
  
    // This gives the value of N in nCr  
    long N = v.get((int)n - 1);  
  
    // Case 1 : When N is odd  
    if (N % 2 == 1)  
    {  
        long first_maxima = N / 2;  
        long second_maxima = first_maxima + 1;  
        long ans1 =(long) 3e18, ans2 = (long)3e18;  
        long from_left = -1, from_right = -1;  
        long from = -1;  
        for (long i = 0; i < n; ++i) 
        {  
            if (v.get((int)i) > first_maxima)  
            {  
                from = i;  
                break;  
            }  
            else 
            {  
                long diff = first_maxima - v.get((int)i);  
                if (diff < ans1) 
                {  
                    ans1 = diff;  
                    from_left = v.get((int)i);  
                }  
            }  
        }  
        from_right = v.get((int)from);  
        long diff1 = first_maxima - from_left;  
        long diff2 = from_right - second_maxima;  
  
        if (diff1 < diff2)  
            System.out.println( N + " " + from_left);  
        else
            System.out.println( N + " " + from_right);  
    }  
  
    // Case 2 : When N is even  
    else 
    {  
        long maxima = N / 2;  
        long ans1 =(int) 3e18;  
        long R = -1;  
        for (long i = 0; i < n - 1; ++i)  
        {  
            long diff = Math.abs(v.get((int)i) - maxima);  
              
            if (diff < ans1)  
            {  
                ans1 = diff;  
                R = v.get((int)i);  
            }  
        }  
        System.out.println( N + " " + R);  
    }  
}  
  
// Driver code  
public static void main(String args[])  
{  
    long arr[] = { 1, 1, 2, 3, 6, 1}; 
    Vector<Long> v = new Vector<Long>( );  
      
    for(int i = 0; i < arr.length; i++) 
    v.add(arr[i]); 
      
    int n = v.size();  
    printMaxValPair(v, n);  
} 
} 
  
// This code is contributed by Arnab Kundu 

