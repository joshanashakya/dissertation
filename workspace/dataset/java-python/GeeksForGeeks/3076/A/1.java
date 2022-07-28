

class GFG { 
  
    public static void main(String[] args) 
    { 
        long ans = 1; 
        long mod = (long)1000000007 * 120; 
          
        for (int i = 0; i < 5; i++)  
            ans = (ans * (55555 - i)) % mod;  
              
        ans = ans / 120; 
        System.out.println("Answer using"
                    + " shortcut: "+ ans); 
    } 
} 
  
// This code is contributed by smitha. 

