

// Java program to print a consecutive sequence 
// to express N if possible. 
class GfG 
{ 
    // Print consecutive numbers from 
    // last to first 
    static void printConsecutive(int last, int first) 
    { 
        System.out.print(first++); 
        for (int x = first; x<= last; x++) 
            System.out.print(" + "+x); 
    }   
      
    static void findConsecutive(int N) 
    { 
        for (int last=1; last<N; last++) 
        { 
            for (int first=0; first<last; first++) 
            { 
                if (2*N == (last-first)*(last+first+1)) 
                { 
                    System.out.printf(N + " = "); 
                    printConsecutive(last, first+1); 
                    return; 
                } 
            } 
        } 
        System.out.print("-1"); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        int n = 12; 
        findConsecutive(n); 
    } 
} 

