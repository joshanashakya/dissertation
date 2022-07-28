

# Python3 code to find the series  
# with largest GCD and sum equals to n 
  
def print_sequence(n, k): 
      
    # stores the maximum gcd that 
    # can be possible of sequence. 
      
    b = int(n / (k * (k + 1) / 2)); 
      
  
    # if maximum gcd comes out to be 
    # zero then not possible 
      
    if b == 0: 
        print ("-1") 
  
    else: 
        # the smallest gcd possible is 1 
        r = 1; 
  
        # traverse the array to find out  
        # the max gcd possible 
        x = 1
          
        while x ** 2 <= n: 
              
            # checks if the number is  
            # divisible or not 
            if n % x != 0: 
              
                # x = x + 1 
                continue; 
                  
              
            # checks if x is smaller then  
            # the max gcd possible and x  
            # is greater then the resultant  
            # gcd till now, then r=x 
            elif x <= b and x > r: 
                r = x 
                # x = x + 1 
  
            # checks if n/x is smaller than  
            # the max gcd possible and n/x  
            # is greater then the resultant  
            # gcd till now, then r=x 
            elif n / x <= b and n / x > r : 
                r = n / x 
                # x = x + 1 
                  
            x = x + 1
          
  
    # traverses and prints d, 2d, 3d, 
    # ..., (k-1)·d, 
        i = 1
        while i < k : 
            print (r * i, end = " ") 
            i = i + 1
              
        last_term = n - (r * (k * (k - 1) / 2)) 
        print (last_term) 
          
          
              
          
# main driver 
print_sequence(24,4)  
print_sequence(24,5) 
print_sequence(6,4) 
  
# This code is contributed by Saloni Gupta 

