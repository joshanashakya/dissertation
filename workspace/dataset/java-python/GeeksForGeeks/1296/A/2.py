

# Python3 program to represent  
# a given number as sum of  
# minimum possible psuedobinary  
# numbers 
  
# function to represent a  
# given number as sum of 
# minimum possible 
# psuedobinary numbers 
def psuedoBinary(n): 
      
    # Repeat below steps 
    # until n > 0 
    while (n > 0): 
          
        # calculate m (A number  
        # that has same number  
        # of digits as n, but  
        # has 1 in place of non-zero  
        # digits 0 in place of 0 digits) 
        temp = n; 
        m = 0; 
        p = 1; 
        while (temp): 
            rem = temp % 10; 
            temp = int(temp / 10); 
              
            if (rem != 0): 
                m += p; 
            p *= 10; 
          
        print(m,end=" "); 
          
        # subtract m from n 
        n = n - m; 
  
# Driver code 
n = 31; 
psuedoBinary(n); 
  
# This code is contributed 
# by mits. 

