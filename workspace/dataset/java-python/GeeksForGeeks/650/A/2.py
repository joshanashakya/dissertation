

# Python program to find the minimum difference. 
  
      
# Function to return required minimum difference 
def minDiff( n,  x,  A): 
   
    mn =  A[0]  
    mx =  A[0]  
  
    # finding minimum and maximum values 
    for i in range(0,n): 
         mn = min( mn,  A[ i])  
         mx = max( mx,  A[ i])  
       
  
    # returning minimum possible difference 
    return max(0,  mx -  mn - 2 *  x)  
   
      
# Driver program 
  
n = 3 
x = 3 
A = [1, 3, 6 ]  
  
# function to return the answer 
print(minDiff( n,  x,  A)) 
  
# This code is contributed by ihritik 

