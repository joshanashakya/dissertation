

// function to count such  
// possible numbers  
  
class GFG { 
  
    public boolean Check_is_possible(int l, int r, 
            int k) { 
        int count = 0; 
  
        for (int i = l; i <= r; i++) { 
  
            // if i is divisible by k  
            if (i % k == 0) { 
                count++; 
            } 
        } 
  
        // if count of such numbers  
        // is greater than one  
        return (count > 1); 
    } 
  
    public static void main(String[] args) { 
        GFG g = new GFG(); 
        int l = 4, r = 12; 
        int k = 5; 
  
        if (g.Check_is_possible(l, r, k)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

