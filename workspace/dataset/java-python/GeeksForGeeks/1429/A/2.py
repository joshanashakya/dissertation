

# Python 3 program to print the sum  
# of all even numbers in range L and R  
  
# Function to return the sum   
# of all natural numbers  
def sumNatural(n): 
    sum = (n * (n + 1)) 
    return int(sum) 
  
# Function to return sum  
# of even numbers in range L and R  
def sumEven(l, r): 
    return (sumNatural(int(r / 2)) - 
            sumNatural(int((l - 1) / 2))) 
  
# Driver Code  
l, r = 2, 5
print("Sum of Natural numbers",  
             "from L to R is", sumEven(l, r))  
  
# This code is contributed  
# by 29AjayKumar 

