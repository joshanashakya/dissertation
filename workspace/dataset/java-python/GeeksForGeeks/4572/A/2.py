

# Python program to find number from  
# given list for which value of the  
# function is closest to A 
  
# Function to find number from  
# given list for which value of the  
# function is closest to A 
def leastValue(P, A, N, a): 
    # Stores the final index 
    ans = -1
      
    # Declaring a variable to store 
    # the minimum absolute difference 
    tmp = float('inf') 
    for i in range(N): 
        # Finding F(n) 
        t = P - a[i] * 0.006
          
        # Updating the index of the answer if 
        # new absolute difference is less than tmp 
        if abs(t - A) < tmp: 
            tmp = abs(t - A) 
            ans = i 
              
    return a[ans] 
  
# Driver Code 
N, P, A = 2, 12, 5
a = [1000, 2000] 
  
print(leastValue(P, A, N, a)) 

