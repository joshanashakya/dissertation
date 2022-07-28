

# Python3  program to count numbers with N digits 
#  which consists of odd number of 0's 
  
# Function to count Numbers with N digits 
#  which consists of odd number of 0's 
def countNumber(n): 
  
    return (pow(10,n)-1)- (pow(10,n)-pow(8,n))//2
  
  
# Driver code 
n = 2
print(countNumber(n)) 
  
# This code is contributed by Shrikant13 

