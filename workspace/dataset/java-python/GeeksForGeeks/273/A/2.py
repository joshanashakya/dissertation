

# Below is Python3 code to count total perfect 
# divisors 
MAX = 100001
   
perfectDiv= [0]*MAX
   
# Pre-compute counts of all perfect divisors 
# of all numbers upto MAX. 
def precomputeCounts(): 
  
    i=1
    while i*i < MAX: 
      
        # Iterate through all the multiples of i*i 
        for j in range(i*i,MAX,i*i): 
   
            # Increment all such multiples by 1 
            perfectDiv[j] += 1
        i += 1
   
# Returns count of perfect divisors of n. 
def countPerfectDivisors( n): 
  
    return perfectDiv[n] 
   
# Driver code 
if __name__ == "__main__": 
  
    precomputeCounts() 
   
    n = 16
    print ("Total perfect divisors of "
         , n , " = " ,countPerfectDivisors(n)) 
   
    n = 12
    print ( "Total perfect divisors of "
         ,n ," = " ,countPerfectDivisors(n)) 

