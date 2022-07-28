

# Python3 program to check the nature of the roots 
  
# BVA for nature of roots of a quadratic equation 
def nature_of_roots(a, b, c): 
  
    # If a = 0, D/2a will yield exception 
    # Hence it is not a valid Quadratic Equation 
    if (a == 0): 
        print("Not a Quadratic Equation"); 
        return; 
      
    D = b * b - 4 * a * c; 
  
    # If D > 0, it will be Real Roots 
    if (D > 0): 
        print("Real Roots"); 
      
    # If D == 0, it will be Equal Roots 
    elif(D == 0): 
        print("Equal Roots"); 
      
    # If D < 0, it will be Imaginary Roots 
    else: 
        print("Imaginary Roots"); 
      
# Function to check for all testcases 
def checkForAllTestCase(): 
  
    print("Testcase\ta\tb\tc\tActual Output"); 
    print(); 
    a = b = c = 0; 
    testcase = 1; 
    while (testcase <= 13): 
        if (testcase == 1): 
            a = 0; 
            b = 50; 
            c = 50; 
        elif(testcase == 2): 
            a = 1; 
            b = 50; 
            c = 50; 
        elif(testcase == 3): 
            a = 50; 
            b = 50; 
            c = 50; 
        elif(testcase == 4): 
            a = 99; 
            b = 50; 
            c = 50; 
        elif(testcase == 5): 
            a = 100; 
            b = 50; 
            c = 50; 
        elif(testcase == 6): 
            a = 50; 
            b = 0; 
            c = 50; 
        elif(testcase == 7): 
            a = 50; 
            b = 1; 
            c = 50; 
        elif(testcase == 8): 
            a = 50; 
            b = 99; 
            c = 50; 
        elif(testcase == 9): 
            a = 50; 
            b = 100; 
            c = 50; 
        elif(testcase == 10): 
            a = 50; 
            b = 50; 
            c = 0; 
        elif(testcase == 11): 
            a = 50; 
            b = 50; 
            c = 1; 
        elif(testcase == 12): 
            a = 50; 
            b = 50; 
            c = 99; 
        elif(testcase == 13): 
            a = 50; 
            b = 50; 
            c = 100; 
          
        print("\t" , testcase , "\t" , a , "\t" , b , "\t" , c , "\t", end=""); 
        nature_of_roots(a, b, c); 
        print(); 
        testcase += 1; 
      
# Driver Code 
if __name__ == '__main__': 
    checkForAllTestCase(); 
  
# This code is contributed by 29AjayKumar 

