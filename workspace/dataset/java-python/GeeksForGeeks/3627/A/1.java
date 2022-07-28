

// Java implementation to check 
// if it is possible to pay a value 
class GFG{ 
   
// Function to check if it 
// is possible to pay a value 
static void knowPair(int a, int b,  
        int n, int s, int m){ 
       
    int i = 0, rem = 0; 
    int count_b = 0, flag = 0; 
   
    // Loop to add the value of coin A 
    while (i <= a) { 
        rem = s - (n * i); 
        count_b = rem / m; 
        if (rem % m == 0 && count_b <= b){ 
            flag = 1; 
        } 
        i++; 
    } 
       
    // Condition to check if it is 
    // possible to pay a value of S 
    if (flag == 1) { 
        System.out.print("YES" +"\n"); 
    }else{ 
        System.out.print("NO" +"\n"); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int A = 1; 
    int B = 2; 
    int n = 3; 
    int S = 4; 
    int m = 2; 
   
    knowPair(A, B, n, S, m); 
} 
} 
  
// This code is contributed by 29AjayKumar 

