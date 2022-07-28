

// Java Program to find the 
// sum of all duration in 
// the form of MM : SS. 
class GFG 
{ 
      
    // Print sum of all duration. 
    static void printSum(int m[],  
                    int s[], int n) 
    { 
        int total = 0; 
      
        // finding total seconds 
        for (int i = 0; i < n; i++) 
        { 
            total += s[i]; 
            total += (m[i] * 60); 
        } 
      
        // print the hours. 
        System.out.print(total / 3600 + " : "); 
        total %= 3600; 
      
        // print the minutes. 
        System.out.print(total / 60 +": "); 
        total %= 60; 
      
        // print the hours. 
        System.out.println(total); 
    }  
      
// Driver code  
public static void main (String[] args) 
{ 
    int m[] = {0, 2, 3, 2, 1 }; 
    int s[] = { 45, 31, 11, 27, 28 }; 
    int n = m.length; 
      
    printSum(m, s, n); 
} 
  
} 
  
// This code is contributed by Anant Agarwal. 

