

# Python3 program to compute  
# division upto n decimal places. 
  
def precisionCompute(x, y, n): 
      
    # Base cases 
    if y == 0: 
        print("Infinite"); 
        return; 
    if x == 0: 
        print(0); 
        return; 
    if n <= 0: 
          
        # Since n <= 0, don't 
        # compute after the decimal 
        print(x / y); 
        return; 
          
    # Handling negative numbers 
    if (((x > 0) and (y < 0)) or 
        ((x < 0) and (y > 0))): 
        print("-", end = ""); 
        if x < 0: 
            x = -x; 
        if y < 0: 
            y = -y; 
              
    # Integral division 
    d = x / y; 
      
    # Now one by print digits  
    # after dot using school  
    # division method. 
    for i in range(0, n + 1): 
        print(d); 
        x = x - (y * d); 
        if x == 0: 
            break; 
        x = x * 10; 
        d = x / y; 
        if (i == 0): 
            print(".", end = ""); 
  
# Driver Code 
x = 22; 
y = 7; 
n = 15; 
precisionCompute(x, y, n); 
  
# This code is contributed by mits 

