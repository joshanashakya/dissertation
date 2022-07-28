n=input()l=list(map(int,input().split()))d={}for  i in l:    if(i!=0):        if(i in d):            d[i]+=1        else:            d[i]=1print(len(d))
