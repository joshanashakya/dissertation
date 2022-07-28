

# Python3 implementation for dot product 
# and cross product of two vector. 
  
n = 3
  
# Function that return 
# dot product of two vector array. 
def dotProduct(vect_A, vect_B): 
  
    product = 0
  
    # Loop for calculate cot product 
    for i in range(0, n): 
        product = product + vect_A[i] * vect_B[i] 
  
    return product 
  
# Function to find 
# cross product of two vector array. 
def crossProduct(vect_A, vect_B, cross_P): 
  
    cross_P.append(vect_A[1] * vect_B[2] - vect_A[2] * vect_B[1]) 
    cross_P.append(vect_A[2] * vect_B[0] - vect_A[0] * vect_B[2]) 
    cross_P.append(vect_A[0] * vect_B[1] - vect_A[1] * vect_B[0]) 
  
  
# Driver function 
if __name__=='__main__': 
    vect_A = [3, -5, 4] 
    vect_B = [2, 6, 5] 
    cross_P = [] 
  
# dotProduct function call 
    print("Dot product:", end =" ") 
    print(dotProduct(vect_A, vect_B)) 
  
# crossProduct function call 
    print("Cross product:", end =" ") 
    crossProduct(vect_A, vect_B, cross_P) 
  
# Loop that print 
# cross product of two vector array. 
    for i in range(0, n): 
        print(cross_P[i], end =" ") 
  
# This code is contributed by 
# Sanjit_Prasad 

