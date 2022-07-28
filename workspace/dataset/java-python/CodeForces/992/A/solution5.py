n=int(input())a=[*map(int,input().split())]d={}for i in a:    if i!=0:        if d.get(i)==None:            d[i]=1        else:            d[i]+=1print(len(d))
