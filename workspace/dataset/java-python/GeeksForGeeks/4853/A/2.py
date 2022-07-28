

# Python3 program to implement  
# Vieta's formula to calculate 
# polynomial coefficients. 
def vietaFormula(roots, n): 
      
    # Declare an array for 
    # polynomial coefficient. 
    coeff = [0] * (n + 1) 
      
    # Set Highest Order  
    # Coefficient as 1 
    coeff[n] = 1
    for i in range(1, n + 1): 
        for j in range(n - i - 1, n): 
            coeff[j] += ((-1) * roots[i - 1] *
                                coeff[j + 1]) 
      
    # Reverse Array  
    coeff = coeff[::-1]  
      
    print("Polynomial Coefficients : ", end = "") 
      
    # Print Coefficients 
    for i in coeff:  
        print(i, end = " ") 
    print() 
  
# Driver Code 
if __name__ == "__main__": 
      
    # Degree of Polynomial 
    n = 4
      
    # Initialise an array by 
    # root of polynomial 
    roots = [-1, 2, -3, 7]  
      
    # Function call 
    vietaFormula(roots, n) 
      
# This code is contributed 
# by Arihant Joshi 

