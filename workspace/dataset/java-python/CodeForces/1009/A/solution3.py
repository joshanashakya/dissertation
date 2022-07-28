n,m=map(int,input().split())c=list(map(int,input().split()))a=list(map(int,input().split()))j=0ans=0for i in c:  if i<=a[j]:    j+=1    ans+=1  if j==m:breakprint(ans)
