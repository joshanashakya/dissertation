

# Python code to generate first  
# 'n' terms of the Moser-de  
# Bruijn Sequence 
  
# Function to generate nth term 
# of Moser-de Bruijn Sequence 
def gen(n): 
  
    # S(0) = 0 
    if n == 0: 
        return 0
  
    # S(1) = 1 
    elif n ==1: 
        return 1
  
    # S(2 * n) = 4 * S(n) 
    elif n % 2 ==0: 
        return 4 * gen(n // 2) 
  
    # S(2 * n + 1) = 4 * S(n) + 1 
    elif n % 2 == 1: 
        return 4 * gen(n // 2) +1
  
# Generating the first 'n' terms 
# of Moser-de Bruijn Sequence 
def moserDeBruijn(n): 
    for i in range(n): 
        print(gen(i), end = " ") 
  
# Driver Program 
n = 15
print("First", n, "terms of ", 
       "Moser-de Brujn Sequence:") 
moserDeBruijn(n) 
  
# This code is contributed by Shrikant13 

