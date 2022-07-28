

# Python3 implementation of the approach  
  
# Function to return the parity  
# of a number  
def parity(a): 
    return a % 3
  
# Function to return the minimum  
# number of operations required  
def solve(array, size):  
  
    operations = 0
    for i in range(0, size - 1):  
  
        # Operation needs to be performed  
        if parity(array[i]) == parity(array[i + 1]):  
  
            operations += 1
            if i + 2 < size:  
  
                # Parity of previous element  
                pari1 = parity(array[i])  
  
                # Parity of next element  
                pari2 = parity(array[i + 2])  
  
                # Update parity of current element to 
                # be other than the parities of the 
                # previous and the next number  
                if pari1 == pari2:  
                    if pari1 == 0:  
                        array[i + 1] = 1
                    elif pari1 == 1:  
                        array[i + 1] = 0
                    else: 
                        array[i + 1] = 1
                  
                else: 
                    if ((pari1 == 0 and pari2 == 1) or 
                        (pari1 == 1 and pari2 == 0)):  
                        array[i + 1] = 2
                    if ((pari1 == 1 and pari2 == 2) or 
                        (pari1 == 2 and pari2 == 1)):  
                        array[i + 1] = 0
                    if ((pari1 == 2 and pari2 == 0) and 
                        (pari1 == 0 and pari2 == 2)): 
                        array[i + 1] = 1
  
    return operations  
  
# Driver Code  
if __name__ == "__main__":  
  
    array = [2, 1, 3, 0]  
    size = len(array)  
    print(solve(array, size))  
  
# This code is contributed by Rituraj Jain 

