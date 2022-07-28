r,d=map(int,input().split())n=int(input())ans=0for _ in range(n):  x,y,p=map(int,input().split())  if x*x+y*y>=(r-d+p)*(r-d+p) and x*x+y*y<=(r-p)*(r-p):    ans+=1print(ans)
