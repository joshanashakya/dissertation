

// Java program to demonstrate 
// Gijswijt's sequence 
import java.util.*; 
  
class GFG  
{ 
  
    // if the sequence is a(1)a(2)a(3)..a(n-1) 
    // check if the sequence can be represented as 
    // x*(y^k) find the largest value of k 
    static int find_count(Vector<Integer> ele)  
    { 
  
        // count 
        int count = 0; 
  
        for (int i = 0; i < ele.size(); i++)  
        { 
  
            // pattern of elements of size 
            // i from the end of sequence 
            Vector<Integer> p = new Vector<Integer>(); 
  
            // count 
            int c = 0; 
  
            // extract the pattern in a reverse order 
            for (int j = ele.size() - 1; 
                     j >= (ele.size() - 1 - i) && j >= 0; 
                     j--)  
            { 
                p.add(ele.get(j)); 
            } 
  
            int j = ele.size() - 1, k = 0; 
  
            // check how many times 
            // the pattern is repeated 
            while (j >= 0) 
            { 
  
                // if the element dosent match 
                if (ele.get(j) != p.get(k))  
                { 
                    break; 
                } 
  
                j--; 
                k++; 
  
                // if the end of pattern is reached 
                // set value of k=0 and 
                // increase the count 
                if (k == p.size())  
                { 
                    c++; 
                    k = 0; 
                } 
            } 
            count = Math.max(count, c); 
        } 
  
        // return the max count 
        return count; 
    } 
  
    // print first n terms of 
    // Gijswijt's sequence 
    static void solve(int n)  
    { 
          
        // set the count 
        int count = 1; 
  
        // stoes the element 
        Vector<Integer> ele = new Vector<Integer>(); 
  
        // print the first n terms of 
        // the sequence 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(count + ", "); 
  
            // push the element 
            ele.add(count); 
  
            // find the count for next number 
            count = find_count(ele); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 10; 
  
        solve(n); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

