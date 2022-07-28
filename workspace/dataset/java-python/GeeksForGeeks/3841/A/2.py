

# Python3 program to find the count of  
# natural octal numbers upto N digits  
  
# Function to return the count of  
# natural octal numbers upto N digits  
def count(N) :  
  
    sum = 0;  
  
    # Loop to iterate from 1 to N  
    # and calculating number of  
    # octal numbers for every 'i'th digit.  
    for i in range(N + 1) : 
        sum += 7 * (8 **(i - 1));  
      
    return int(sum); 
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 4;  
    print(count(N));  
  
# This code is contributed by AnkitRai01 

