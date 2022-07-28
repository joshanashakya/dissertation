

# Python code to generate first  
# 'n' terms of Logic sequence 
  
# Function to generate a fixed 
# number 
def logicOfSequence(N): 
    if(N % 2 == 0): 
        N = N * N 
    else: 
        N = N * N * N 
    return N 
  
N = 6
print (logicOfSequence(N)) 
  
# This code is contributed by 
# Vishal Gupta

