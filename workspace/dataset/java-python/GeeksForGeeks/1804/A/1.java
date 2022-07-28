

// Java implementation of the above approach 
class GFG 
{ 
static boolean check(int s) 
{ 
  
// creating a frequency array 
    int[] freq = new int[10]; 
      
    int r,i; 
    for(i=0;i<10;i++) 
    { 
        freq[i]= 0; 
    } 
    while(s != 0) 
    { 
  
    // Finding the last digit of the number 
        r = s % 10; 
  
        // Dividing the number by 10 to  
        // eliminate last digit 
        s = (int)(s / 10); 
  
        // counting frequency of each digit  
        freq[r] += 1; 
    } 
  
          
  
    int xor__ = 0; 
  
    // checking if the xor of all frequency is zero or not 
    for ( i=0;i<10;i++) 
    { 
    xor__ = xor__ ^ freq[i]; 
    if(xor__ == 0) 
        return true; 
    else
        return false; 
    } 
    return true; 
          
} 
  
// Driver function 
    public static void main(String[] args) { 
        int s = 122233; 
        if(check(s)) 
            System.out.println("Yes\n"); 
        else
            System.out.println("No\n"); 
} 
  
// This code is contributed by 
// Rajput-Ji 
} 

