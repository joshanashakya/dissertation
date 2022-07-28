

# Python3 code to find sum of given series 
  
# Function to find sum of given series 
def sumOfTheSeries(n): 
      
    # Type-casting n/n+1 from int to float 
    return (float(n) / (n + 1)) 
  
# Driver function    
if __name__ == '__main__': 
          
    n = 10
    ans = sumOfTheSeries(n) 
      
    # Rounding decimal value 
    print (round(ans, 6)) 
  
# This code is contributed by 'saloni1297' 

