

# Python3 implementation of the approach  
  
# Function to return the no. of years  
def noOfYears(t1, n1, t2):  
  
    years = (t2 - 1) * n1 / (t1 - 1)  
    return years  
  
# Driver code  
if __name__ == "__main__": 
  
    T1, N1, T2 = 3, 5, 6
    print(noOfYears(T1, N1, T2)) 
      
# This code is contributed  
# by Rituraj Jain 

