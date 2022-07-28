

# Python3 program to count number of  
# ways to break 
# a number in three parts. 
  
# Function to count number of ways 
# to make the given number n 
def count_of_ways(n): 
  
    count = 0
    for i in range(0, n+1): 
        for j in range(0, n+1): 
            for k in range(0, n+1): 
                if(i + j + k == n): 
                    count = count + 1
    return count 
  
# Driver Function 
if __name__=='__main__': 
    n = 3
    print(count_of_ways(n)) 
  
  
# This code is contributed by 
# Sanjit_Prasad 

