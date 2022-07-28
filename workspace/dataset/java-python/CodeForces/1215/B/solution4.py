n=int(input())pos=1neg=0k=1l=list(map(int,input().split()))for t in l:    if(t<0):        k*=-1    if(k<0):        neg+=1    else:        pos+=1print(pos*neg, (n*(n+1)//2)-(pos*neg))
