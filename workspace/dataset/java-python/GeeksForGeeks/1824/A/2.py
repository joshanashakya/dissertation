

# Python3 program to find  
# n-th number containing  
# only 3 and 5.  
def reverse(s):  
    if len(s) == 0:  
        return s  
    else:  
        return reverse(s[1:]) + s[0]  
            
def findNthNo(n):  
    res = "";  
    while (n >= 1):  
            
        # If n is odd, append  
        # 3 and move to parent  
        if (n & 1):  
            res = res + "3";  
            n = (int)((n - 1) / 2);  
                
            # If n is even, append 5  
            # and move to parent  
        else:  
            res = res + "5";  
            n = (int)((n - 2) / 2);  
                
    # Reverse res  
    # and return.  
    return reverse(res);  
    
# Driver code  
n = 5;  
print(findNthNo(n));  

