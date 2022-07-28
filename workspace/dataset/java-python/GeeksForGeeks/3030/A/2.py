

# Python 3 program to count pairs of numbers 
# from 1 to N with Product divisible 
# by their Sum 
  
# Function to count pairs 
def countPairs(n): 
      
    # variable to store count 
    count = 0
      
    # Generate all possible pairs such that 
    # 1 <= x < y < n 
    for x in range(1, n): 
        for y in range(x + 1, n + 1): 
            if ((y * x) % (y + x) == 0): 
                count += 1
  
    return count 
  
# Driver code 
n = 15
print(countPairs(n)) 
  
# This code is contributed  
# by PrinciRaj1992 

