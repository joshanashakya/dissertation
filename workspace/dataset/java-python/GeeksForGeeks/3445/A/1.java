

class GFG  
{ 
    // Function to check  
    // if a number can  
    // be represent as  
    // as a sum of 3 prime 
  
    static void check(int n)  
    { 
        if (n % 2 == 1 && n > 5)  
        { 
            System.out.println("YES"); 
        }  
        else 
        { 
            System.out.println("NO"); 
        } 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int a = 3; 
        int b = 7; 
        check(a); 
        check(b); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

