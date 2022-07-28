

# Python3 program to find n-th  
# number in the sorted list of  
# multiples of two numbers. 
  
# Return the n-th number in the 
# sorted list of multiples of  
# two numbers. 
def nthElement(a, b, n): 
    seq = []; 
  
    # Generating first n  
    # multiple of a. 
    for i in range(1, n + 1): 
        seq.append(a * i); 
  
    # Sorting the sequence. 
    seq.sort(); 
  
    # Generating and storing first  
    # n multiple of b and storing 
    # if not present in the sequence. 
    i = 1; 
    k = n;  
    while(i <= n and k > 0): 
          
        # If not present in the sequence 
        try: 
            z = seq.index(b * i); 
        except ValueError: 
              
            # Storing in the sequence. 
            seq.append(b * i); 
            seq.sort(); 
            k -= 1; 
        i += 1; 
  
    return seq[n - 1]; 
  
# Driver Code 
a = 3; 
b = 5; 
n = 5; 
print(nthElement(a, b, n)); 
  
# This code is contributed by mits 

