

# Python3 program to find the position 
# of the given prime number 
limit = 1000000
position = [0]*(limit + 1) 
   
# Function to precompute the position 
# of every prime number using Sieve 
def sieve(): 
  
    # 0 and 1 are not prime numbers 
    position[0] = -1
    position[1] = -1
   
    # Variable to store the position 
    pos = 0
    for i in range(2, limit + 1): 
        if (position[i] == 0): 
   
            # Incrementing the position for 
            # every prime number  
            pos += 1
            position[i] = pos 
            for j in range( i * 2, limit + 1 ,i): 
                position[j] = -1
   
# Driver code 
if __name__ == "__main__": 
    sieve() 
   
    n = 11
    print(position[n]) 
      
# This code is contributed by chitranayal 

