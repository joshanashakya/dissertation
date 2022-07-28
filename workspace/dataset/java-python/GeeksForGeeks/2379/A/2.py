

# python program to find count 
# of multiples of 3 and 5 in  
# {1, 2, 3, ..n} 
  
def countOfMultiples(n): 
    # Add multiples of 3 and 5. 
    # Since common multples are 
    # counted twice in n/3 + n/15, 
    # subtract common multiples 
    return (int(n/3) + int(n/5) - int(n/15)); 
  
  
# Driver program to test 
# above function 
print(countOfMultiples(6)) 
print(countOfMultiples(16)) 
  
# This code is contributed by Sam007. 

