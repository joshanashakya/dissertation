n,m=map(int,input().split())count=[0]*na=list(map(int,input().split()))for i in range(m):    count[a[i]-1]+=1print(min(count))
