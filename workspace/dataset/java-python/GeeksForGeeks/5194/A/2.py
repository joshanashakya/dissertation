

# Python3 implementation for the 
# above mentioned problem 
   
# Function to check if original Array 
# can be retained by performing XOR 
# with M exactly K times 
def check(Arr,  n, M,  K): 
    flag = 0
   
    # Check if O is present or not 
    for i in range(n): 
        if (Arr[i] == 0): 
            flag = 1
      
    # If K is odd and 0 is not present 
    # then the answer will always be No. 
    if (K % 2 != 0 and flag == 0): 
        return "No"
   
    # Else it will be Yes 
    else: 
        return "Yes"; 
   
# Driver Code 
if __name__=='__main__':  
  
    Arr = [ 1, 1, 2, 4, 7, 8 ] 
    M = 5; 
    K = 6; 
    n = len(Arr); 
   
    print(check(Arr, n, M, K)) 
  
# This article contributed by Princi Singh 

