

# Python 3 implementation of the 
# above approach 
  
# Function to check if it is  
# possible or not 
def check(a, n): 
    for i in range(n): 
        if (a[i]): 
            return True
  
    return False
  
# Driver code 
if __name__ == '__main__': 
    a = [0, 1, 0, 1] 
    n = len(a) 
      
    if(check(a, n)): 
        print("YES") 
    else: 
        print("NO") 
          
# This code is contributed by 
# Surendra_Gangwar 

