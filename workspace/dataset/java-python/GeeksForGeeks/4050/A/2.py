

# Python3 code to find the sum of given series 
  
# Function to find the sum of given series 
def sumOfTheSeries( n ): 
      
    # Computing sum term by term 
    sum = 0
    for i in range(1, n + 1): 
        sum += 1.0 / (i * (i + 1));  
    return sum
  
  
# Driver function 
if __name__ == '__main__': 
      
    ans = sumOfTheSeries(10) 
      
    # Rounding decimal value to 6th decimal place 
    print (round(ans, 6)) 
  
# This code is contributed by 'saloni1297' 

