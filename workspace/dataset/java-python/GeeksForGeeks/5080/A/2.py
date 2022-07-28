

# Python3 program to find 
# LCM of digits of a number 
  
# define lcm function 
def lcm_fun(a, b): 
  
    if (b == 0): 
        return a; 
    return lcm_fun(b, a % b); 
  
def digitLCM(n): 
  
    lcm = 1; 
    while (n > 0): 
        lcm = int((n % 10 * lcm) / 
              lcm_fun(n % 10, lcm)); 
  
        # If at any point LCM  
        # become 0. return it 
        if (lcm == 0): 
            return 0; 
  
        n = int(n / 10); 
      
    return lcm; 
  
# Driver code 
n = 397; 
print(digitLCM(n)); 
  
# This code is contributed by mits 

