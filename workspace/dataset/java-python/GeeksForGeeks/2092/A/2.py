

# Python 3 program to find the sum of  
# all the integers below N which are 
# multiples of either A or B 
  
# Function to return the sum of all  
# the integers below N which are  
# multiples of either A or B 
def findSum(n, a, b): 
    sum = 0
    for i in range(0, n, 1): 
          
        # If i is a multiple of a or b 
        if (i % a == 0 or i % b == 0): 
            sum += i 
  
    return sum
  
# Driver code 
if __name__ == '__main__': 
    n = 10
    a = 3
    b = 5
    print(findSum(n, a, b)) 
  
# This code is contributed by 
# Surendra_Gangwar 

