

// Java  implementation of the above approach  
import java.io.*; 
  
class GFG { 
      
      
// function to count odd product pair  
static int count_odd_pair(int n, int a[])  
{  
    int odd = 0, even = 0;  
  
    for (int i = 0; i < n; i++) {  
  
        // if number is even  
        if (a[i] % 2 == 0)  
            even++;  
  
        // if number is odd  
        else
            odd++;  
    }  
  
    // count of ordered pairs  
    int ans = odd * (odd - 1);  
  
    return ans;  
}  
  
// function to count even product pair  
static int count_even_pair(int odd_product_pairs, int n)  
{  
    int total_pairs = (n * (n - 1));  
    int ans = total_pairs - odd_product_pairs;  
    return ans; 
}  
  
// Driver code  
    public static void main (String[] args) { 
  
        int n = 6;  
        int []a = { 2, 4, 5, 9, 1, 8 };  
  
        int odd_product_pairs = count_odd_pair(n, a);  
  
        int even_product_pairs = count_even_pair(  
            odd_product_pairs, n);  
  
        System.out.println( "Even Product Pairs = "+ 
            even_product_pairs ); 
           
        System.out.println("Odd Product Pairs= "+ 
             odd_product_pairs ); 
      
    } 
} 
//This Code is Contributed by ajit 

