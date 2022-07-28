

// Java implementation of the above approach 
  
public class GFG{ 
      
    // Function to find the number 
    static int findNum(int div[], int rem[], int N) 
    { 
        int num = rem[N - 1]; 
      
        for (int i = N - 2; i >= 0; i--) { 
            num = num * div[i] + rem[i]; 
        } 
      
        return num; 
    } 
  
  
     // Driver Code 
     public static void main(String []args){ 
            int div[] = { 8, 3 };  
            int rem[] = { 2, 2 };  
            int N = div.length;  
    
            System.out.println(findNum(div, rem, N));  
  
     } 
     // This code is contributed by ANKITRAI1 
} 

