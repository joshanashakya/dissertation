

# Python 3 program to check if tower 
# of sight issue occurs or not 
   
# Function to check if point p lies in 
# between the line joining p1 and p2 
def checkIntersection(p1,p2,p): 
   
    # If parallel to X-axis 
    if (p1[1] == p2[1] 
        and p1[1] == p[1]): 
   
        if (p[0] <= max(p1[0], p2[0]) 
            and (p[0] >= min(p1[0], p2[0]))): 
   
            # Point p lies between p1 and p2 
            return 1
   
    # If parallel to Y-axis 
    if (p1[0] == p2[0] 
        and p1[0] == p[0]): 
   
        if (p[1] <= max(p1[1], p2[1]) 
            and (p[1] >= min(p1[1], p2[1]))): 
   
            # Point p lies between p1 and p2 
            return 1
   
    # If point p satisfies the equation 
    # of line joining p1 and p2 
    else : 
        val = ((p[1] - p1[1])*(p2[0] - p1[0]) 
              - (p[0] - p1[0]) 
                    * (p2[1] - p1[1])) 
   
        if (val == 0): 
            if ((p[0] <= max(p1[0], p2[0]) 
                 and (p[0] >= min(p1[0], p2[0]))) 
                and (p[1] <= max(p1[1], p2[1]) 
                    and (p[1] >= min(p1[1], p2[1])))): 
                return 1
   
    return 0
   
# Function to check if tower 
# of sight issue occurred 
def towerOfSight(a, b, c, d): 
    flag = 0
   
    if (checkIntersection(a, c, b)): 
   
        # B lies between AC 
        flag = 1
   
    elif (checkIntersection(a, c, d)): 
        # D lies between AC 
        flag = 1
   
    elif (checkIntersection(b, d, a)): 
   
        # A lies between BD 
        flag = 1
   
    elif (checkIntersection(b, d, c)): 
   
        # C lies between BD 
        flag = 1
   
    if(flag): 
        print("Yes") 
    else: 
        print("No") 
   
# Driver code 
if __name__ == "__main__": 
  
    # Point A 
    a = [ 0, 0 ] 
   
    # Point B 
    b = [ 0, -2 ] 
   
    # Point C 
    c = [ 2, 0 ] 
   
    # Point D 
    d = [ 0, 2 ] 
   
    towerOfSight(a, b, c, d) 
   
# This code is contributed by chitranayal 

