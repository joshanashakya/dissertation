def checkhor(x,y):    c=0    cy=y+1    while(cy<n and grid[x][cy]=='X'):        cy+=1        c+=1    if(c>=4):        return True    cy=y-1    while(cy>=0 and grid[x][cy]=='X'):        cy-=1        c+=1    #print(1,x,y,c)    if(c>=4):        return True    else:        return False def checkver(x,y):    c=0    cx=x+1    while(cx<n and grid[cx][y]=='X'):        cx+=1        c+=1    if(c>=4):        return True    cx=x-1    while(cx>=0 and grid[cx][y]=='X'):        cx-=1        c+=1    #print(2,x,y,c)    if(c>=4):        return True    else:        return Falsedef checkdiag(x,y):    c=0    cx=x+1    cy=y+1    while(cx<n and cy<n and grid[cx][cy]=='X'):        cx+=1        cy+=1        c+=1    if(c>=4):        return True    cx=x-1    cy=y-1    while(cx>=0 and cy>=0 and grid[cx][cy]=='X'):        cx-=1        cy-=1        c+=1    if(c>=4):        return True    c=0    cx=x+1    cy=y-1    while(cx<n and cy>=0 and grid[cx][cy]=='X'):        cx+=1        cy-=1        c+=1    if(c>=4):        return True    cx=x-1    cy=y+1    while(cx>=0 and cy<n and grid[cx][cy]=='X'):        cx-=1        cy+=1        c+=1    if(c>=4):        return True    else:        return False            n=10grid=[]for i in range(n):    grid.append(list(input()))ans='NO'for i in range(n):    for j in range(n):        if(grid[i][j]=='.'):            if(checkhor(i,j) or checkver(i,j) or checkdiag(i,j)):                ans='YES'                break    if(ans=='YES'):        breakprint(ans)