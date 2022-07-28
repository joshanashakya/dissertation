

# Python program to find sum between two indexes 
# when there is no update. 
  
def find_ans(ar, j, k): 
    l = len(ar) 
    for i in range(1, l): 
        ar[i] = ar[i] + ar[i-1] 
  
    print(ar[k] - ar[j-1]) 
    return;  
  
  
pr = [1, 2, 3 ,4, 5] 
ar = pr[:] 
find_ans(ar, 1, 3) 
ar = pr[:] 
find_ans(ar, 2 ,4) 
  
# Code Contributed by Mohit Gupta_OMG <(0_o)> 

