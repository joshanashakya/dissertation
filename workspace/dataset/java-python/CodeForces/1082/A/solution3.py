from math import ceilfor _ in range(int(input())):  n,x,y,d=map(int,input().split())  if abs(x-y)%d==0:print(abs(x-y)//d)  else:    ans=10**18    if (y-1)%d==0:      ans=min(ans,(y-1)//d+(x-1+d-1)//d)    if (n-y)%d==0:       ans=min(ans,(n-y)//d+(n-x+d-1)//d)    if ans==10**18:print(-1)    else:print(ans)