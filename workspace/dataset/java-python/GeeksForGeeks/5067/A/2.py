

# A Simple Method to count cubes between a and b 
   
# Function to count cubes between two numbers 
def countCubes(a, b): 
    cnt = 0 # Initialize result 
   
    # Traverse through all numbers 
    for i in range(a,b+1): 
   
        # Check if current number 'i' is perfect 
        # cube 
        for j in range(i+1): 
            if j*j*j>i: 
                break
            if j * j * j == i: 
                cnt+=1
   
    return cnt 
   
# Driver code 
if __name__ == '__main__': 
    a = 7
    b = 30
    print("Count of Cubes is ",countCubes(a, b)) 
  
# This code is contributed by mohit kumar 29 

