

# Python 3 program to check if given  
# encoding represents a single string. 
  
def isUnique(a, n, k): 
    sum = 0
    for i in range(0, n, 1): 
        sum += a[i] 
      
    sum += n - 1
      
    # Return true if sum becomes k 
    return (sum == k)  
  
# Driver Code 
if __name__ == '__main__': 
    a = [3, 3, 3] 
    n = len(a) 
    k = 12
    if (isUnique(a, n, k)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surndra_Gangwar 

