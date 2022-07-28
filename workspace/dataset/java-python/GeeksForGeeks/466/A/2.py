

# Python program to prthe Fibonacci numbers 
# present at K-th level of a Binary Tree 
  
# Initializing the max value 
MAX_SIZE = 100005
  
# Array to store all the 
# fibonacci numbers 
fib =[0]*(MAX_SIZE + 1) 
  
# Function to generate fibonacci numbers 
# using Dynamic Programming 
def fibonacci(): 
      
    # 0th and 1st number of the series 
    # are 0 and 1 
    fib[0] = 0
    fib[1] = 1
      
    for i in range(2, MAX_SIZE + 1): 
          
        # Add the previous two numbers in the 
        # series and store it 
        fib[i] = fib[i - 1] + fib[i - 2] 
          
# Function to prthe Fibonacci numbers 
# present at Kth level of a Binary Tree 
def printLevel(level): 
      
    # Finding the left and right index 
    left_index = pow(2, level - 1) 
    right_index = pow(2, level) - 1
      
    # Iterating and printing the numbers 
    for i in range(left_index, right_index+1): 
        print(fib[i - 1],end=" ") 
          
    print() 
  
# Driver code 
  
# Precomputing Fibonacci numbers 
fibonacci() 
  
K = 4
printLevel(K) 
  
# This code is contributed by shivanisinghss2110 

