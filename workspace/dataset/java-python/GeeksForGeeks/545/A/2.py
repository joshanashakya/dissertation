

# Python program to implement 
# the above approach 
  
def maxnumber(n, k): 
# Function to return the 
# largest number possible 
   
    for i in range(0, k): 
        # Generate the largest number  
        # after removal of the least K digits 
        # one by one 
        ans = 0
        i = 1
        
        while n // i > 0: 
        # Remove the least digit  
        # after every iteration 
            temp = (n//(i * 10))*i + (n % i) 
            i *= 10
        # Store the numbers formed after  
        # removing every digit once 
          
        # Compare and store the maximum 
            if temp > ans: 
                ans = temp 
        n = ans         
    
    # Return the remaining number 
    # after K removals 
    return ans; 
    
   
n = 6358
k = 1
print(maxnumber(n, k)) 

