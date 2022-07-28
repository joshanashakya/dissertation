

# Function to calculate count 
def calculate(array, size): 
  
    count = 0
  
    for i in range(size):  
        if (array[i] % 2 == 0 and 
            array[i] != 0 and 
            array[i] != 2 ): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
    a = [ 1, 3, 4, 6 ] 
    size = len(a) 
    print(calculate(a, size)) 
  
# This code is contributed 
# by ChitraNayal 

