v1,v2=map(int,input().split())t,d=map(int,input().split())t-=1u=[0]*(t+1)u[0]=v1for i in range(1,t+1):  u[i]=min(u[i-1]+d,v2+(t-i)*d)ans=0for i in range(0,t+1):  ans+=u[i]print(ans)
