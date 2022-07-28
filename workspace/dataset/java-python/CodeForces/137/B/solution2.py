n=int(input())l=list(map(int,input().split()))s=set(l)c=0for i in s:    if((i>n) or (i<0)):        c=c+1c=c+(n-(len(s)))print(c)
