n,m=map(int,input().split())l1=list(map(int,input().split()))l2=list(map(int,input().split()))x=min(l1)y=max(l1)res=max(2*x,y)#print(res)if res<min(l2):    print(res)else:    print(-1)
