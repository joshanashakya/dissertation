

# Python3 program to find number of pairs 
# in an array such that their XOR is 0 
  
# Function to calculate the count 
def calculate(a) : 
  
    # Sorting the list using 
    # built in function 
    a.sort() 
      
    count = 1
    answer = 0
      
    # Traversing through the elements 
    for i in range(1, len(a)) : 
  
        if a[i] == a[i - 1] : 
              
            # Counting frequncy of each elements 
            count += 1
  
        else : 
  
            # Adding the contribution of 
            # the frequency to the answer 
            answer = answer + count * (count - 1) // 2
            count = 1
  
    answer = answer + count * (count - 1) // 2
      
    return answer 
  
  
# Driver Code 
if __name__ == '__main__': 
      
    a = [1, 2, 1, 2, 4] 
  
    # Print the count 
    print(calculate(a)) 

