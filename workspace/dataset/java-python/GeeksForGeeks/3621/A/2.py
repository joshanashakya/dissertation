

# Python3 program to check if a can be splitted 
# into two strings such that one is divisible by 'a' 
# and other is divisible by 'b'. 
  
# Finds if it is possible to partition str 
# into two parts such that first part is 
# divisible by a and second part is divisible 
# by b. 
def findDivision(str, a, b): 
    lenn = len(str) 
      
    # Create an array of size lenn+1 and  
    # initialize it with 0. 
    # Store remainders from left to right  
    # when divided by 'a' 
    lr = [0] * (lenn + 1) 
    lr[0] = (int(str[0]))%a 
    for i in range(1, lenn): 
        lr[i] = ((lr[i - 1] * 10) % a + \ 
                     int(str[i])) % a 
                       
    # Compute remainders from right to left  
    # when divided by 'b' 
    rl = [0] * (lenn + 1) 
    rl[lenn - 1] = int(str[lenn - 1]) % b 
    power10 = 10
    for i in range(lenn - 2, -1, -1): 
        rl[i] = (rl[i + 1] + int(str[i]) * power10) % b 
        power10 = (power10 * 10) % b 
          
    # Find a pothat can partition a number 
    for i in range(0, lenn - 1): 
          
        # If split is not possible at this point 
        if (lr[i] != 0): 
            continue
              
        # We can split at i if one of the following 
        # two is true. 
        # a) All charactes after str[i] are 0 
        # b) after str[i] is divisible by b, i.e., 
        # str[i+1..n-1] is divisible by b. 
        if (rl[i + 1] == 0): 
            print("YES") 
            for k in range(0, i + 1): 
                print(str[k], end = "") 
              
            print(",", end = " ") 
              
            for i in range(i + 1, lenn): 
                print(str[k], end = "") 
                return
      
    print("NO") 
  
# Driver code 
str = "123"
a, b = 12, 3
findDivision(str, a, b) 
  
# This code is contributed by SHUBHAMSINGH10 

