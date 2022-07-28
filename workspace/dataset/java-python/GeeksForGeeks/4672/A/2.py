

# Python3 implementation of the approach 
  
# Function that returns true is selling 
# of the tickets is possible 
def isSellingPossible(n, a): 
  
    c25 = 0; 
    c50 = 0; 
    i = 0; 
    while(i < n):  
      
  
        # Nothing to return to the customer 
        if (a[i] == 25): 
            c25 += 1; 
        elif (a[i] == 50):  
          
            c50 += 1; 
  
            # Check if 25 can be returned  
            # to customer. 
            if (c25 == 0): 
                break; 
            c25 -= 1; 
          
        else: 
      
            # Try returning one 
            # 50 and one 25 
            if (c50 > 0 and c25 > 0): 
              
                c50 -= 1; 
                c25 -= 1; 
              
            # Try returning three 25 
            elif (c25 >= 3): 
                c25 -= 3; 
            else: 
                break; 
        i += 1; 
      
    # If the loop did not break, 
    # all the tickets were sold 
    if (i == n): 
        return True; 
    else: 
        return False; 
  
# Driver Code 
a = [ 25, 25, 50, 100 ]; 
n = len(a); 
  
if (isSellingPossible(n, a)): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed by mits 

