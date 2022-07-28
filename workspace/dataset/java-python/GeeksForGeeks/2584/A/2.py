

# Python3 code to verify  
# Nesbitt's Inequality 
  
def isValidNesbitt(a, b, c): 
      
    # 3 parts of the 
    # inequality sum 
    A = a / (b + c); 
    B = b / (a + c); 
    C = c / (a + b); 
    inequality = A + B + C; 
  
    return (inequality >= 1.5); 
  
# Driver Code 
a = 1.0;  
b = 2.0; 
c = 3.0; 
if (isValidNesbitt(a, b, c)): 
    print("Nesbitt's inequality satisfied." ,  
          " for real numbers ",a,", ",b,", ",c); 
else: 
    print("Not satisfied"); 
  
# This code is contributed by mits 

