n=int(input())l=list(map(int,input().split()))d={}for i in l:    if(i in d):        d[i]+=1    else:        d[i]=1if(l.count(0)>=1):    print(len(d)-1)else:    print(len(d))
