

// Java implementation to find 
// the next distinct digits number 
class GFG{ 
   
// Function to find the 
// next distinct digits number 
static void findNextNumber(int n) 
{ 
    int h[] = new int[10]; 
    int i = 0, msb = n, rem = 0; 
    int next_num = -1, count = 0; 
   
    // Loop to find the distinct  
    // digits using hash array 
    // and the number of digits 
    while (msb > 9) { 
        rem = msb % 10; 
        h[rem] = 1; 
        msb /= 10; 
        count++; 
    } 
    h[msb] = 1; 
    count++; 
   
    // Loop to find the most significant 
    // distinct digit of the next number 
    for (i = msb + 1; i < 10; i++) { 
        if (h[i] == 0) { 
            next_num = i; 
            break; 
        } 
    } 
       
    // Condition to check if the number 
    // is possible with the same number 
    // of digits count 
    if (next_num == -1){ 
        for (i = 1; i < msb; i++){ 
            if (h[i] == 0){ 
                next_num = i; 
                count++; 
                break; 
            } 
        } 
    } 
       
    // Condition to check if the desired 
    // most siginificant distinct  
    // digit is found 
    if (next_num > 0){ 
           
        // Loop to find the minimum next digit 
        // which is not present in the number 
        for (i = 0; i < 10; i++) { 
            if (h[i] == 0) { 
                msb = i; 
                break; 
            } 
        } 
           
        // Computation of the number  
        for (i = 1; i < count; i++) { 
            next_num = ((next_num * 10) + msb); 
        } 
           
        // Condition to check if the number is  
        // greater than the given number 
        if (next_num > n) 
            System.out.print(next_num+ "\n"); 
        else
            System.out.print("Not Possible \n"); 
    } 
    else{ 
        System.out.print("Not Possible \n"); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 2019; 
    findNextNumber(n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

