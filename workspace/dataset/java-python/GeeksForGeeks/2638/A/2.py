

# Python3 code to generate 'Nth'  
# terms of this sequence 
  
# Function to generate a  
# fixed number 
def nthTerm(N): 
    nth = 0
  
    # Finding nth term 
    for i in range(N, 0, -1): 
        nth += pow(i, i) 
    return nth 
  
# Driver code 
N = 3
print(nthTerm(N)) 
  
# This code is contributed 
# by Shrikant13 

