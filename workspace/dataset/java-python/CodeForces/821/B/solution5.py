m,b=list(map(int,input().split()))      u=0for j in range(b-1,-1,-1):    y=j    x=m*(b-j)     s=x*(x+1)//2    t=y*(y+1)//2    p=t+s+(s)*y+t*x    if p>u:        u=p print(u)
