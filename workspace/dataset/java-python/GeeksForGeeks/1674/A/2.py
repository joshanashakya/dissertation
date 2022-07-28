

# Python3 program to check if m can  
# be represented as powers of w. 
def asPowerSum(w, m): 
    while (m > 0): 
        if ((m - 1) % w == 0): 
            m = (m - 1) / w; 
          
        elif ((m + 1) % w == 0): 
            m = (m + 1) / w; 
          
        elif (m % w == 0): 
            m = m / w; 
          
        else: 
            break; # None of 3 worked. 
      
    # If m is not zero means, it can't be 
    # represented in terms of powers of w. 
    return (m == 0); 
  
# Driver code 
w = 3;  
m = 7; 
if (asPowerSum(w, m)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

