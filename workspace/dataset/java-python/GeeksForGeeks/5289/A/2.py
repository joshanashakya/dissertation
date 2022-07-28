

# Python3 program to verify 
# Nicomachu's Theorem 
  
def NicomachuTheorum_sum(n): 
      
    # Compute sum of cubes 
    sum = 0; 
    for k in range(1, n + 1): 
        sum += k * k * k; 
          
    # Check if sum is equal to 
    # given formula. 
    triNo = n * (n + 1) / 2; 
    if (sum == triNo * triNo): 
        print("Yes"); 
    else: 
        print("No"); 
  
# Driver Code 
n = 5; 
NicomachuTheorum_sum(n); 
  
# This code is contributed  
# by mits 

