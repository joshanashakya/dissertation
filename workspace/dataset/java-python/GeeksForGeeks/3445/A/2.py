

# Function to check  
# if a number can  
# be represent as  
# as a sum of 3 prime 
def check(n): 
  if n % 2 == 1 and n > 5: 
    print('YES') 
  else: 
    print('NO') 
  
# Driver code 
def main(): 
  a = 3
  b = 7
  check(a) 
  check(b) 
  
main() 

