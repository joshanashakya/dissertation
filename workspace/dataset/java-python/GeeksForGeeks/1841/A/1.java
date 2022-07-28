

// Java program to find number whose set 
// bits are maximum among 'l' and 'r' 
class gfg 
{ 
      
  
// Returns smallest number whose set bits 
// are maximum in given range. 
static int countMaxSetBits(int left, int right) 
{ 
    // Initialize the maximum count and 
    // final answer as 'num' 
    int max_count = -1, num = 0; 
    for (int i = left; i <= right; ++i)  
    { 
        int temp = i, cnt = 0; 
  
        // Traverse for every bit of 'i' 
        // number 
        while (temp > 0) 
        { 
            if (temp % 2 == 1) 
                ++cnt; 
            temp >>= 1; 
        } 
  
        // If count is greater than previous 
        // calculated max_count, update it 
        if (cnt > max_count) 
        { 
            max_count = cnt; 
            num = i; 
        } 
    } 
    return num; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int l = 1, r = 5; 
    System.out.println(countMaxSetBits(l, r)); 
  
    l = 1; r = 10; 
    System.out.print(countMaxSetBits(l, r)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

