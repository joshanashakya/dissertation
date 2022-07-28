

# Python3 implementation of the approach 
  
# Function to print the required sequence  
def generateSequence(n, g):  
  
    for i in range(1, n + 1):  
        print(i * g, end = " ") 
  
# Driver Code 
if __name__ == "__main__": 
  
    n, g = 6, 5
    generateSequence(n, g)  
  
# This code is contributed by Rituraj Jain 

