

# Python3 program to find the number of  
# integers from 1 to n which contains  
# digits 0's and 1's only  
  
# Function to find the number of integers  
# from 1 to n which contains 0's and 1's only  
def countNumbers(x, n):  
      
    # If number is greater than n  
    if x > n :  
        return 0
  
    # otherwise add count this number and  
    # call two functions  
    return (1 + countNumbers(x * 10, n) + 
                countNumbers(x * 10 + 1, n))  
  
# Driver code  
if __name__ == '__main__':  
    n = 120;  
  
    print(countNumbers(1, n)); 
      
# This code is contributed by Arnab Kundu 

