

// Java implementation of the approach 
class GFG  
{ 
    static int Count(String s, int pos ) 
    { 
        // returns character at index pos - 1  
        int c = s.charAt(pos - 1); 
        int counter = 0; 
        for (int i = 0; i < pos - 1; i++ )  
        { 
            if(s.charAt(i) == c)  
                counter = counter + 1; 
        } 
        return counter; 
    } 
      
    // Driver Code  
    public static void main (String[] args) 
    { 
        String s = "abacsddaa"; 
        int pos; 
        int n = s.length();  
          
        int query[] = {9, 3, 2}; 
        int Q = query.length; 
          
        for(int i = 0; i < Q; i++) 
        {  
            pos = query[i]; 
            System.out.println(Count(s, pos)); 
        } 
    } 
} 
  
// This code is contributed by AnkitRai01 

