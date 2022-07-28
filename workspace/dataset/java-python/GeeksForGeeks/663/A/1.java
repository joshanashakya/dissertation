

// Java program to print all the numbers  
// less than N which have at most 2 unique digits  
import java.util.*; 
class GFG{ 
    
static Set<Integer> st= new HashSet<Integer>();  
    
// Function to generate all possible numbers  
static void generateNumbers(int n, int num, int a, int b)  
{  
    // If the number is less than n  
    if (num > 0 && num < n)  
        st.add(num);  
    
    // If the number exceeds  
    if (num >= n)  
        return;  
    
    // Check if it is not the same number  
    if (num * 10 + a > num)  
        generateNumbers(n, num * 10 + a, a, b);  
    
    generateNumbers(n, num * 10 + b, a, b);  
}  
    
// Function to print all numbers  
static void printNumbers(int n)  
{  
    // All combination of digits  
    for (int i = 0; i <= 9; i++)  
        for (int j = i + 1; j <= 9; j++)  
            generateNumbers(n, 0, i, j);  
    
    System.out.print( "The numbers are: ");  
    
    // Print all numbers  
    System.out.print(st); 
      
    st.clear(); 
}  
    
// Driver code  
public static void main(String args[])  
{  
    int n = 12;  
    
    printNumbers(n);  
    
}  
} 
// This code is contributed by Arnab Kundu 

