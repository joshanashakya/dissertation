

# Program to check if the binary string  
# contains m consecutive 1's or 0's 
  
# Function that checks if 
# the binary string contains m 
# consecutive 1's or 0's 
def check(s, m): 
  
    # length of binary string 
    l = len(s); 
  
    # counts zeros 
    c1 = 0; 
  
    # counts 1's 
    c2 = 0; 
  
    for i in range(0, l - 1):  
  
        if (s[i] == '0'):  
            c2 = 0; 
              
        # count consecutive 0's 
            c1 = c1 + 1;  
          
        else : 
            c1 = 0; 
  
            # count consecutive 1's 
            c2 = c2 + 1;  
          
        if (c1 == m or c2 == m): 
            return True; 
      
    return False; 
  
# Driver Code 
s = "001001"; 
m = 2; 
  
# function call 
if (check(s, m)): 
    print("YES"); 
else : 
    print("NO"); 
  
# This code is contributed  
# by Shivi_Agggarwal 

