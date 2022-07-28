n=int(input())l=list(map(int,input().split()))s=sum(l)q=s//(n-1)r=s%(n-1)if(r):    q+=1print(max(max(l),q))
