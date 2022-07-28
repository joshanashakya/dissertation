

# Function to print 
# all the combinations 
def printCombinations(a, n, m): 
  
    # Iterate for all 
    # combinations 
    for i in range(0, (1 << n)):  
      
        sum = 0
  
        # Initially 100 in binary  
        # if n is 3 as  
        # 1<<(3-1) = 100 in binary 
        num = 1 << (n - 1) 
  
        # Iterate in the array  
        # and assign signs to 
        # the array elements 
        for j in range(0, n):  
          
            # If the j-th bit  
            # from left is set 
            # take '+' sign 
            if ((i & num) > 0): 
                sum += a[j] 
            else: 
                sum += (-1 * a[j]) 
  
            # Right shift to check if 
            # jth bit is set or not 
            num = num >> 1
  
        if (sum % m == 0):  
          
            # re-initialize 
            num = 1 << (n - 1) 
  
            # Iterate in the  
            # array elements 
            for j in range(0, n):  
  
                # If the jth from 
                # left is set 
                if ((i & num) > 0): 
                    print("+", a[j], end = " ",  
                                     sep = "") 
                else: 
                    print("-", a[j], end = " ", 
                                     sep = "") 
  
                # right shift 
                num = num >> 1
            print("") 
      
# Driver code 
a = [ 3, 5, 6, 8 ] 
n = len(a) 
m = 5
printCombinations(a, n, m) 
  
# This code is contributed 
# by smita. 

