

# Python3 program to find coordinate of the 
# triangle given midpoint of each side 
  
N = 3
  
# Return after solving the equations and 
# finding the vertices coordinate. 
def solve(v): 
  
    res = [] 
  
    # Finding sum of all three coordinate. 
    all3 = v[0] + v[1] + v[2] 
  
    # Solving the equation. 
    res.append(all3 - v[1] * 2) 
    res.append(all3 - v[2] * 2) 
    res.append(all3 - v[0] * 2) 
    return res 
  
# Finds vertices of a triangles from given 
# middle vertices. 
def findVertex(xmid, ymid): 
  
    # Find X coordinates of verices. 
    V1 = solve(xmid) 
  
    # Find Y coordinates of verices. 
    V2 = solve(ymid) 
  
    # Output the solution. 
    for i in range(0, 3): 
        print(V1[i], end=" ") 
        print(V2[i]) 
  
# Driver code 
if __name__=='__main__': 
    xmid = [5, 4, 5] 
    ymid = [3, 4, 5] 
    findVertex(xmid, ymid) 
  
# This code is contributed by 
# Sanjit_Prasad 

