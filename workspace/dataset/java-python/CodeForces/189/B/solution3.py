n,w=map(int,input().split())ans=0for x in range(1,n):    for y in range(w-1):        ans+=((w-y)//2)*min(x,n-x)print(ans)
