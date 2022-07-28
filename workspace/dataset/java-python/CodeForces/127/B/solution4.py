n=(int)(input())d={}a=list(map(int,input().split()))for i in a:    if i in d:        d[i]+=1    else:        d[i]=1res=0for i in d:    res+=(int)(d[i]/2)print((int)(res/2))
