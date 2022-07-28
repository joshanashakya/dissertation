

// Java programm to print the triangle 
// seperated pattern using 
// star and slash character 
class GFG{ 
   
// Function to print pattern recursively 
static int printPattern( 
    int i, int j, int n) 
{ 
    // Base Case 
    if (j >= n) { 
        return 0; 
    } 
    if (i >= n) { 
        return 1; 
    } 
   
    // Conditions to print slash 
    if (j == i || j == n - 1 - i) { 
   
        // Condition to print 
        // forword slash 
        if (i == n - 1 - j) { 
            System.out.print("/"); 
        } 
   
        // Condition to print 
        // backward slash 
        else { 
            System.out.print("\\"); 
        } 
    } 
   
    // Else print '*' 
    else { 
        System.out.print("*"); 
    } 
   
    // Recursive call for rows 
    if (printPattern(i, j + 1, n) 
        == 1) { 
        return 1; 
    } 
   
    System.out.println(); 
   
    // Recursive call for changing 
    // the rows 
    return printPattern(i + 1, 0, n); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 9; 
   
    // Function Call 
    printPattern(0, 0, N); 
} 
} 
  
// This code is contributed by Rajput-Ji 

