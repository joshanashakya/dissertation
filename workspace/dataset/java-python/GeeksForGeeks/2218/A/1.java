

// Java program to find the maximum number 
// of numbers divisible by 3 in large number  
class GFG 
{ 
  
static int get_max_splits(String num_String) 
{  
    // This will contain the count of the splits  
    int count = 0, current_num; 
      
    // This will keep sum of all successive  
    // integers, when they are indivisible by 3  
    int running_sum = 0; 
    for (int i = 0; i < num_String.length(); i++) 
    { 
        current_num = num_String.charAt(i) - '0';  
        running_sum += current_num;  
          
        // This is the condition of finding a split  
        if (current_num % 3 == 0 ||  
        (running_sum != 0 && running_sum % 3 == 0)) 
        {  
            count += 1; 
            running_sum = 0; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    System.out.print(get_max_splits("12345") +"\n");  
} 
} 
  
// This code is contributed by 29AjayKumar 

