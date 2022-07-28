

# Python3 program to count  
# even and odd digits 
# in a given number  
# using char array 
  
# Function to count digits 
def countEvenOdd(num, n): 
    even_count = 0; 
    odd_count = 0; 
    num=list(str(num)) 
    for i in num: 
        if i in ('0','2','4','6','8'): 
            even_count+=1
        else: 
            odd_count+=1
    print("Even count : ",  
              even_count); 
    print("Odd count : ",  
              odd_count); 
    if (even_count % 2 == 0 and 
        odd_count % 2 != 0): 
        return 1; 
    else: 
        return 0; 
  
# Driver Code 
num = (1, 2, 3); 
n = len(num); 
t = countEvenOdd(num, n); 
  
if t == 1: 
    print("YES"); 
else: 
    print("NO"); 
      
# This code is contributed by mits. 

