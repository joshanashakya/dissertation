

# Python3 program to find the unit  
# place digit of the first N natural 
# numbers factorials 
  
# Function to find the unit's 
# and ten's place digit 
def get_last_two_digit(N): 
      
    # Let us write for cases when 
    # N is smaller than or equal 
    # to 10 
    if N <= 10: 
        ans = 0
        fac = 1
        for i in range(1, N + 1): 
            fac = fac * i 
            ans += fac 
        ans = ans % 100
        return ans 
          
    # We know following 
    # (1! + 2! + 3! + 4!...+10!) % 100 = 13 
    # // (N >= 10) 
    else: 
        return 13
  
# Driver Code 
N = 1
for N in range(1, 11): 
    print("For N = ", N, ": ",  
           get_last_two_digit(N), sep = ' ') 
  
# This code is contributed  
# by sahilshelangia 

