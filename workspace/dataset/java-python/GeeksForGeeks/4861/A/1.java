

// Java program gives result approximated 
// to 5 decimal places. 
  
class GFG  
{ 
    static float sqroot(float s) 
    { 
        // This will be the nearest perfect square to s 
        int pSq = 0; 
          
        //This is the sqrt of pSq 
        int N = 0;  
      
        // Find the nearest perfect square to s 
        for (int i = (int)(s); i > 0; i--) 
        { 
            for (int j = 1; j < i; j++) 
            { 
                if (j*j == i) 
                { 
                    pSq = i; 
                    N = j; 
                    break; 
                } 
            } 
            if (pSq > 0) 
                break; 
        } 
          
        // calculate d     
        float d = s - pSq;      
          
        // calculate P 
        float P = d/(2.0f*N);  
          
        // calculate A 
        float A = N+P;  
           
        // calculate sqrt(S). 
        float sqrt_of_s = A-((P*P)/(2.0f*A)); 
        return sqrt_of_s; 
    } 
      
    // Driver program  
    public static void main (String[] args)  
    { 
        float num = 9.2345f; 
        float sqroot_of_num = sqroot(num); 
        System.out.print("Square root of "+num+" = "
                         + Math.round(sqroot_of_num*100000.0)/100000.0); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

