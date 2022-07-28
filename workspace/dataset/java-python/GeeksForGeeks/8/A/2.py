

# Python 3 program to find 
# prime divisors of 
# all numbers from 1 to n 
  
# function to find prime  
# divisors of all numbers  
# from 1 to n 
def Sum(N): 
   
    SumOfPrimeDivisors = [0] * (N + 1) 
       
    for i in range(2, N + 1) : 
       
        # if the number is prime 
        if (SumOfPrimeDivisors[i] == 0) : 
           
            # add this prime to 
            # all it's multiples 
            for j in range(i, N + 1, i) : 
               
                SumOfPrimeDivisors[j] += i 
               
    return SumOfPrimeDivisors[N] 
   
# Driver code 
N = 60
print("Sum of prime" ,  
      "divisors of 60 is",  
                  Sum(N)); 
                    
# This code is contributed  
# by Smitha 

