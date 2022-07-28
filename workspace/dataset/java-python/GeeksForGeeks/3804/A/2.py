

# implementation to find the total 
# energy required to rearrange the 
# numbers 
n = 4
  
# function to find the total energy 
# required to rearrange the numbers 
def calculateEnergy(mat,n): 
  
    tot_energy = 0
  
    # nested loops to access the  
    # elements of the given matrix 
    for i in range(n): 
        for j in range(n): 
  
            #store quotient 
            q = mat[i][j]//n 
  
            # final destination location 
            # (i_des, j_des) of the  
            # element mat[i][j] is being 
            # calculated 
            i_des = q 
            j_des = mat[i][j]- (n*q) 
  
            # energy required for the 
            # movement of the element 
            # mat[i][j] is calculated  
            # and then accumulated in 
            # the 'tot_energy' 
            tot_energy += (abs(i_des-i)  
                         + abs(j_des-j)) 
  
    # required total energy 
    return tot_energy 
  
  
# Driver Program 
mat = [[4, 7, 0, 3], 
       [8, 5, 6, 1], 
         [9, 11, 10, 2], 
       [15, 13, 14, 12]] 
print("Total energy required = ", 
        calculateEnergy(mat,n), "units") 
  
# This code is contributed by Shrikant13. 

