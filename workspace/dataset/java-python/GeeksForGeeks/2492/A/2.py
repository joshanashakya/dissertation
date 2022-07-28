

# Python3 program for Check whether   
# a number can be represented by  
# sum of two squares using binary search.  
    
def judgeSquareSum(c): 
    
    # Iterating loop from 0 to c - a * a.  
    a = 0;  
    while(a * a <= c): 
        b = c - int(a * a);  
    
        # If b is a square root of   
        # c - a * a then return true.  
        if (binary_search(0, b, b)):  
            return 1;  
        a+=1;  
    return 0;  
    
# Function for binary search.  
def binary_search(s, e, n): 
    # If lower limit exceeds   
    # upper limit.  
    if (s > e): 
        return 0; 
      
    # Calculating mid.  
    mid = s + int((e - s) / 2); 
    if (int(mid * mid) == n): 
        return 1; 
      
    if (int(mid * mid) > n): 
        return binary_search(s, mid - 1, n); 
      
    return binary_search(mid + 1, e, n);  
    
# Driver Code  
c = 17;  
if(judgeSquareSum(c)):  
    print("true");  
else: 
    print("false");  
    
# This code is contributed by mits 

