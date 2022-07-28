r,d = map(int,input().split())n = int(input())ans = 0for _ in range(n):    x,y,k= map(int,input().split())    dc = (x*x+y*y)**0.5    if    dc+k<=r and dc-k>=r-d:        ans+=1print(ans)
