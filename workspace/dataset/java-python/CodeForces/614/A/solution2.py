 import math l,r,k = map(int,input().split())   h=0for j in range(10**9):    if l<=k**j<=r:        print(k**j,end=' ')        h+=1    elif k**j>r:        break            if h==0:    print(-1)
