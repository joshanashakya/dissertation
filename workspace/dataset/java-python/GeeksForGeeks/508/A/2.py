

# Python program to print the series  
# 2, 1, 4, 3, 6, 5, …. up to N terms  
  
# Function to print the series  
def printPattern(N): 
    for i in range(1, N + 1): 
          
        # Find and print the ith term  
        print(i - 1 if i % 2 == 0 
                    else i + 1, end = " ") 
  
# Driver code 
N = 10
printPattern(N) 
  
# This code is contributed by Shrikant13 

