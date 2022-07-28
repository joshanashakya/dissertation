

// Java program to check the nature of the roots 
import java.util.*; 
  
class GFG 
{ 
  
// BVA for nature of roots of a quadratic equation 
static void nature_of_roots(int a, int b, int c) 
{ 
  
    // If a = 0, D/2a will yield exception 
    // Hence it is not a valid Quadratic Equation 
    if (a == 0) 
    { 
        System.out.print("Not a Quadratic Equation"
            +"\n"); 
        return; 
    } 
  
    int D = b * b - 4 * a * c; 
  
    // If D > 0, it will be Real Roots 
    if (D > 0) { 
        System.out.print("Real Roots" +"\n"); 
    } 
  
    // If D == 0, it will be Equal Roots 
    else if (D == 0) { 
        System.out.print("Equal Roots" +"\n"); 
    } 
  
    // If D < 0, it will be Imaginary Roots 
    else { 
        System.out.print("Imaginary Roots" +"\n"); 
    } 
} 
  
// Function to check for all testcases 
static void checkForAllTestCase() 
{ 
  
    System.out.print("Testcase"
        + "\ta\tb\tc\tActual Output"
        +"\n"); 
    System.out.println(); 
    int a, b, c; 
    a = b = c = 0; 
    int testcase = 1; 
    while (testcase <= 13) { 
        if (testcase == 1) { 
            a = 0; 
            b = 50; 
            c = 50; 
        } 
        else if (testcase == 2) { 
            a = 1; 
            b = 50; 
            c = 50; 
        } 
        else if (testcase == 3) { 
            a = 50; 
            b = 50; 
            c = 50; 
        } 
        else if (testcase == 4) { 
            a = 99; 
            b = 50; 
            c = 50; 
        } 
        else if (testcase == 5) { 
            a = 100; 
            b = 50; 
            c = 50; 
        } 
        else if (testcase == 6) { 
            a = 50; 
            b = 0; 
            c = 50; 
        } 
        else if (testcase == 7) { 
            a = 50; 
            b = 1; 
            c = 50; 
        } 
        else if (testcase == 8) { 
            a = 50; 
            b = 99; 
            c = 50; 
        } 
        else if (testcase == 9) { 
            a = 50; 
            b = 100; 
            c = 50; 
        } 
        else if (testcase == 10) { 
            a = 50; 
            b = 50; 
            c = 0; 
        } 
        else if (testcase == 11) { 
            a = 50; 
            b = 50; 
            c = 1; 
        } 
        else if (testcase == 12) { 
            a = 50; 
            b = 50; 
            c = 99; 
        } 
        else if (testcase == 13) { 
            a = 50; 
            b = 50; 
            c = 100; 
        } 
        System.out.print("\t" + testcase+ "\t"
            + a+ "\t" + b+ "\t"
            + c+ "\t"); 
        nature_of_roots(a, b, c); 
        System.out.println(); 
        testcase++; 
    } 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    checkForAllTestCase(); 
} 
} 
  
// This code is contributed by 29AjayKumar 

