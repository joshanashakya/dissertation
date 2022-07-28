

// program for nth Tribonacci word 
class GFG { 
  
// Returns n-th Tribonacci word 
static String tribWord(int n) { 
    String Sn_1 = "1"; 
    String Sn_2 = "12"; 
    String Sn_3 = "1213"; 
    String tmp; 
    for (int i = 3; i <= n; i++) { 
    tmp = Sn_3; 
    Sn_3 += (Sn_2 + Sn_1); 
    Sn_1 = Sn_2; 
    Sn_2 = tmp; 
    } 
  
    return Sn_3; 
} 
  
// Driver code 
public static void main(String[] args) { 
    int n = 6; 
    System.out.print(tribWord(n)); 
} 
} 
// This code is contributed by Anant Agarwal. 

