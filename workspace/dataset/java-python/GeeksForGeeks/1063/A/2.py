

# Python3 program to find number of pairs 
# in an array such that their XOR is 0 
  
# Function to calculate the answer 
def calculate(a) : 
      
    # Finding the maximum of the array 
    maximum = max(a) 
      
    # Creating frequency array 
    # With initial value 0 
    frequency = [0 for x in range(maximum + 1)] 
      
    # Traversing through the array  
    for i in a : 
           
        # Counting frequency 
        frequency[i] += 1
      
    answer = 0
      
    # Traversing through the frequency array 
    for i in frequency : 
          
        # Calculating answer 
        answer = answer + i * (i - 1) // 2
      
    return answer 
  
# Driver Code 
a = [1, 2, 1, 2, 4] 
print(calculate(a)) 

