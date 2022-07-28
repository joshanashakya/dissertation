

// Java Implementation of above approach  
import java.util.*; 
  
class GFG 
{  
  
// function to find minimum increment required  
static int minIncrementForUnique(int []A)  
{  
  
    // collect frequency of each element  
    HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();  
  
    for(int i:A) 
    { 
        if(mpp.containsKey(i)) 
            mpp.put(i, mpp.get(i) + 1);  
        else
            mpp.put(i, 1);  
    } 
  
    // array of unique values taken  
    Vector<Integer> taken = new Vector<Integer>();  
  
    int ans = 0;  
  
    for (int x = 0; x < 100000; x++)  
    {  
        if (mpp.containsKey(x) && mpp.get(x) >= 2)  
            taken.add(x * (mpp.get(x)- 1));  
        else if(taken.size() > 0 &&  
                ((mpp.containsKey(x) &&  
                mpp.get(x) == 0)||!mpp.containsKey(x)))  
        {  
            ans += x - taken.get(taken.size() - 1);  
            taken.remove(taken.size() - 1);  
        }  
    }  
  
    // return answer  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
  
    int []A = {3, 2, 1, 2, 1, 7};  
      
    System.out.print(minIncrementForUnique(A));  
} 
}  
  
// This code is contributed by Rajput-Ji 

