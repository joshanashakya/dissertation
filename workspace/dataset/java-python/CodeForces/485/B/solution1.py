n=int(input())minX=10**10maxX=-(10**10)minY=10**10maxY=-(10**10)for i in range(n):    mine=list(map(int,input().split()))    minX=min(mine[0],minX)    maxX=max(mine[0],maxX)    minY=min(mine[1],minY)    maxY=max(mine[1],maxY)print(max(maxX-minX, maxY-minY)**2)
