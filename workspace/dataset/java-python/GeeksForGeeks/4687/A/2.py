

# Python3 program to  
# calculate 1 ^ 2 + 2 ^ 2 + 3 ^ 2+.. 
  
# Function to calculate series 
def summation(n): 
    return sum([i**2 for i in 
               range(1, n + 1)]) 
  
# Driver Code  
if __name__ == "__main__": 
    n = 2
    print(summation(n)) 

