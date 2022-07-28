

# Python3 program to find  
# nth centered hexagonal number 
  
# Function to find centered hexagonal  
# series till n given numbers. 
def centeredHexagonalSeries(n) : 
    for i in range(1, n + 1) : 
          
        # Formula to calculate nth 
        # centered hexagonal series. 
        print(3 * i * (i - 1) + 1, end=" ") 
          
# Driver Code 
if __name__ == '__main__' : 
      
    n = 10
    centeredHexagonalSeries(n) 
  
# This code is contributed  
# by 'Akanshgupta' 

