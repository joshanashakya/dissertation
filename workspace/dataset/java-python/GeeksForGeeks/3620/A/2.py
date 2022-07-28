

# Python 3 program to count number of  
# ways to break a number in three parts. 
  
# Function to count number of ways 
# to make the given number n 
def count_of_ways(n): 
    count = 0
    count = (n + 1) * (n + 2) // 2
    return count 
  
# Driver code 
n = 3
print(count_of_ways(n)) 
  
# This code is contributed by Shrikant13 

