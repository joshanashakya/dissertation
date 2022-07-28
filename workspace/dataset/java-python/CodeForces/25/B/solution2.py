n=int(input())l=list(map(int,input()))ans=[]if n%2==1:    ans.append(l[0])    l=l[1:]    n-=1ans+=l[0:2]for i in range(2,n,2):    ans.append('-')    ans+=l[i:i+2]print(*ans,sep="")
