

# Python3 program to find the sum 
  
# Function to find the sum  
def sumofPairs(n) : 
  
    # Store the Binary equivalent of decimal  
    # number in reverse order  
    v = [] 
    sum = 0
  
    # Calculate binary equivalent of decimal number 
    while n > 0 : 
        v.append(n % 2) 
        n = n // 2
  
    # for correct binary representation  
    v.reverse() 
  
    # Consider every pair  
    for i in range(len(v) - 1) : 
  
        for j in range(i + 1, len(v)) : 
  
            # handles all combinations of 01  
            if v[i] == 0 and v[j] == 1 : 
                sum += 1
  
            #  handles all combinations of 11 
            if v[i] == 1 and v[j] == 1 : 
                sum += 3
  
            # handles all combinations of 10  
            if v[i] == 1 and v[j] == 0 : 
                sum += 2
  
    return sum
  
# Driver Code 
if __name__ == "__main__" : 
      
    N = 5
  
    # function calling 
    print(sumofPairs(N)) 
  
# This code is contributed by ANKITRAI1 

