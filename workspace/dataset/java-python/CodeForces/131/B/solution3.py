n=(int)(input())d={}res=0m=list(map(int,input().split()))for i in m:    if (-i) in d:        res+=d[-i]    if i in d:        d[i]+=1    else:        d[i]=1print(res)
