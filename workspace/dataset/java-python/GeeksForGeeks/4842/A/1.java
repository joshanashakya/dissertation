

// Java implementation of the above approach  
  
import java.util.*; 
class solution 
{ 
  
    // Function to find the cost to paint all poles  
    static void find(int n,int m,int p,int q[][])  
    {  
        // To store all the columns,create list  
        Vector <Integer> z= new Vector<Integer>() ;  
        int i ;  
          
        for(i = 0;i < p;i++)  
            z.add(q[i][1]);  
          
        // sort in ascending order  
        Collections.sort(z);  
          
        // z.back() gives max value  
        // z.front() gives min value  
        System.out.print(z.get(z.size()-1) - z.get(0) ) ;  
    }  
      
    // Driver code  
    public static void main(String args[]) 
    {  
        int n = 2;  
        int m = 2;  
        int p = 2;  
          
        int q[][] = {{0,0},{0,1}} ;  
          
        find(n, m, p, q);  
          
           
    }  
  
  
  
} 
//contributed by Arnab Kundu 

