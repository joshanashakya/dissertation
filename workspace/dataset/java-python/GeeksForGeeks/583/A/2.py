

# Python3 implmentation to find the number 
# the number of ways to reach Nth stair 
# by taking 1, 2 step at a time and 
# 3 Steps at a time exactly once. 
  
# Function to find the number 
# the number of ways to reach Nth stair 
def number_of_ways(n): 
      
    # Array including number 
    # of ways that includes 3 
    includes_3 = [0]*(n + 1) 
  
    # Array including number of 
    # ways that doesn't includes 3 
    not_includes_3 = [0] * (n + 1) 
  
    # Intially to reach 3 stairs by 
    # taking 3 steps can be 
    # reached by 1 way 
    includes_3[3] = 1
  
    not_includes_3[1] = 1
    not_includes_3[2] = 2
    not_includes_3[3] = 3
  
    # Loop to find the number 
    # the number of ways to reach Nth stair 
    for i in range(4, n + 1): 
        includes_3[i] = includes_3[i - 1] + \ 
                        includes_3[i - 2] + \ 
                        not_includes_3[i - 3] 
        not_includes_3[i] = not_includes_3[i - 1] + \ 
                           not_includes_3[i - 2] 
    return includes_3[n] 
  
# Driver Code 
n = 7
  
print(number_of_ways(n)) 
  
# This code is contributed by mohit kumar 29 

