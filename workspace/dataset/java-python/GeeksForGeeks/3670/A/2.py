

# Python3 program to find length of a jump 
# to reach end avoiding all obstacles 
def avoidObstacles(obs): 
      
    # sort the list in ascending order 
    obs = sorted(obs) 
      
    # set jump distance to 1 
    jump_dist = 1
      
    # flag to check if current jump distance  
    # hits an obstacle 
    obstacle_hit = True
  
    while(obstacle_hit): 
          
        obstacle_hit = False
        jump_dist += 1
          
        # checking if jumping with current length 
        # hits an obstacle 
        for i in range(0, len(obs)): 
            if obs[i] % jump_dist == 0: 
                  
                # if obstacle is hit repeat process 
                # after increasing jump distance 
                obstacle_hit = True
                break
  
    return jump_dist 
      
# Driver Code 
a = [5, 3, 6, 7, 9] 
b = avoidObstacles(a) 
print(b) 
  
# This code is contributed by ViratJoshi 

