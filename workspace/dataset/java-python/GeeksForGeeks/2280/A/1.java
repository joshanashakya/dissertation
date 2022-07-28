

// Java code to generate  
// first 'n' terms  
// of Connell Sequence  
import java.util.*; 
  
class GFG  
{ 
      
    // Function to generate a  
    // fixed number of even or  
    // odd terms. The size of r  
    // decides whether numbers  
    // to be generated even or odd.  
  
    static Vector<Long> gen(long n, Vector<Long> r)  
    {      
        long a = r.get(r.size() - 1);      
        a++;      
        for (int i = 1; i <= n; a += 2, i++)  
        { 
            r.add(a); 
        }      
        return r;      
    } 
  
    // Generating the first  
    // 'n' terms of  
    // Connell Sequence  
    static Vector<Long> conell(long n)  
    {      
        Vector<Long> res = new Vector<Long>();      
        long k = 1; 
  
        // A dummy 0 is inserted  
        // at the beginning for  
        // consistency  
        res.add(0L);      
          
        while (true) 
        { 
            // Calling function  
            // gen() to generate  
            // 'k' number of terms  
            res = gen(k, res);          
            k++;          
              
            int j = res.size() - 1;          
            while (j != n && j + k > n) 
            { 
                k--; 
            } 
  
            // Checking if 'n'  
            // terms are already  
            // generated  
            if (j >= n)  
            { 
                break; 
            }          
        } 
  
        // Removing the previously  
        // inserted dummy 0  
        res.remove(0);      
          
        return res;      
    } 
  
    // Driver Code  
    public static void main(String[] args) 
    { 
        long n = 10;      
          
        System.out.println("The first "
                    + n + " terms are"); 
                  
        Vector<Long> res = conell(n);      
        for (int i = 0; i < res.size(); i++) 
        { 
            System.out.print(res.get(i) + " "); 
        }      
        System.out.println();      
    }  
}  
  
// This code has been contributed 
// by Rajput-Ji 

