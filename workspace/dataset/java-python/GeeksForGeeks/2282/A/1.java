

// Java program for Alcuin's Sequence 
import java.util.*; 
  
class GFG  
{ 
  
// find the nth term of 
// Alcuin's sequence 
static int Alcuin(int n) 
{ 
    double _n = n, ans; 
  
    ans = Math.round((_n * _n) / 12) -  
          Math.floor(_n / 4) *  
          Math.floor((_n + 2) / 4); 
  
    // return the ans 
    return (int) ans; 
} 
  
// print first n terms of Alcuin number 
static void solve(int n) 
{ 
    int i = 0; 
  
    for (i = 1; i <= n; i++)  
    { 
  
        // display the number 
        System.out.print(Alcuin(i) + ", "); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 15; 
    solve(n); 
} 
} 
  
// This code is contributed by Princi Singh 

