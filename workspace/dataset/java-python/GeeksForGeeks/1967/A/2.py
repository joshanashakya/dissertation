

# Python3 program to find the 
# Maximum distance between two 1's 
# in Binary representation of N 
def longest_gap(N): 
  
    distance = 0
    count = 0
    first_1 = -1
    last_1 = -1
  
    # Compute the binary representation 
    while (N > 0): 
        count += 1
  
        r = N & 1
  
        if (r == 1): 
            if first_1 == -1: 
                first_1 = count 
            else: 
                first_1 = first_1 
  
            last_1 = count 
  
        N = N // 2
  
    # if N is a power of 2 
    # then return -1 
    if (last_1 <= first_1): 
        return -1
          
    # else find the distance 
    # between the first position of 1 
    # and last position of 1 
    else: 
        distance = last_1 - first_1 - 1
        return distance 
  
# Driver code 
N = 131
print(longest_gap(N)) 
  
N = 8
print(longest_gap(N)) 
  
N = 17
print(longest_gap(N)) 
  
N = 33
print(longest_gap(N)) 
  
# This code is contributed by Mohit Kumar 

