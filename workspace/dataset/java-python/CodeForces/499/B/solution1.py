a,b = map(int,input().split())l={}for i in range(b):    p,q=input().split()    if(len(q)>=len(p)):        l[p] = p    else:        l[p] = qk = input().split()for i in k:    print(l[i])
